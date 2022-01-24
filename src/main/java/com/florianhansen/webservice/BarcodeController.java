package com.florianhansen.webservice;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.florianhansen.webservice.data.Barcode;
import com.florianhansen.webservice.data.BarcodeRepository;

@RestController
public class BarcodeController {

	@Autowired
	private BarcodeRepository barcodeRepo;
	
	@GetMapping("/barcodes/{id}")
	public Barcode getBarcode(@PathVariable Integer id) {
		return barcodeRepo.getOne(id);
	}
	
	@PostMapping("/barcodes/new")
	public Barcode postBarcode(@RequestBody Integer id) throws BadRequestException {
		if (barcodeRepo.existsById(id)) {
			throw new BadRequestException("Barcode already registered");
		}
		
		Barcode barcode = new Barcode();
		barcode.setId(id);
		barcode.setScanDate(new Date());

		return barcodeRepo.save(barcode);
	}
	
}
