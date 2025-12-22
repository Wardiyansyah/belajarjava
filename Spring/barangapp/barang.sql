CREATE DATABASE `barangdb` ;

USE `barangdb`;

DROP TABLE IF EXISTS `barang`;

CREATE TABLE `barang` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `nama` varchar(255) DEFAULT NULL,
  `deskripsi` varchar(255) NOT NULL,
  `harga` double NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8 COLLATE=utf8_general_ci;

insert  into `barang`(`id`,`nama`,`deskripsi`,`harga`) values 
(1,'Buku','Buku Tulis Kiki',10000),
(2,'Buku Gambar','Buku Gambar Kiki',9000),
(3,'Pensil','Pensil Kenko',6000),
(4,'Pensil','Pensil Joyco',5000);