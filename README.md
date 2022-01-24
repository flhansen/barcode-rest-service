# QRCodeTracker REST Service
This service is part of the [QRCodeTracker](https://github.com/flhansen/qrcodetracker-android-app) project. It is implemented as REST service to serve barcode related data.

## Authors
[Florian Hansen](https://florian-hansen.com/)

## Routes

| Method | Path             | Description                     |
| ------ | ---------------- | ------------------------------- |
| `GET`  | `/barcodes/{id}` | Fetch barcode with the given ID |
| `POST` | `/barcodes/new`  | Creates a new barcode entry inside the database |

## Quickstart
Download the [latest release](https://github.com/flhansen/qrcodetracker-rest-service/releases/latest) and run the application using the command

    java -jar /path/to/qrcodetracker-rest-service-<version>.jar