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

## How to deploy on Linux machines

### Using precompiled JAR archive
First, you need to download the [latest release](https://github.com/flhansen/qrcodetracker-rest-service/releases/latest) and move it to your specific distribution location (e.g. `/srv/www`).

    mkdir -p /srv/www
    wget -O /srv/www/qrcodetracker-rest-service.jar https://github.com/flhansen/qrcodetracker-rest-service/releases/latest/download/qrcodetracker-rest-service.jar

Then create a systemd service file under `/etc/systemd/system/qrcodetracker.service`.

```
[Unit]
Description=QRCodeTracker REST Service
After=network.target

[Service]
Type=simple
Restart=always
RestartSec=3
User=<user>
ExecStart=/srv/www/qrcodetracker-rest-service.jar

[Install]
WantedBy=multi-user.target
```

Now, start your service manually.

    systemctl start qrcodetracker.service

Finally you can enable the service, so it automatically starts on system startup.

    systemctl enable qrcodetracker.service
