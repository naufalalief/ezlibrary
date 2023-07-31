/*
SQLyog Enterprise v12.5.1 (64 bit)
MySQL - 10.4.14-MariaDB : Database - perpus
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`perpus` /*!40100 DEFAULT CHARACTER SET utf8mb4 */;

USE `perpus`;

/*Table structure for table `buku` */

DROP TABLE IF EXISTS `buku`;

CREATE TABLE `buku` (
  `id_buku` int(11) NOT NULL AUTO_INCREMENT,
  `judul` varchar(45) DEFAULT NULL,
  `pengarang` varchar(45) DEFAULT NULL,
  `jumhal` int(24) DEFAULT NULL,
  `penerbit` varchar(24) DEFAULT NULL,
  `tabit` int(12) DEFAULT NULL,
  `stok` int(12) DEFAULT NULL,
  `lokasi` varchar(24) DEFAULT NULL,
  PRIMARY KEY (`id_buku`)
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=utf8mb4;

/*Data for the table `buku` */

insert  into `buku`(`id_buku`,`judul`,`pengarang`,`jumhal`,`penerbit`,`tabit`,`stok`,`lokasi`) values 
(1,'Belajar Pemrograman Java dari Nol','Petani Kode',25,'Petani Ngewe',2019,2002,'A-32'),
(2,'Pemrograman Java Menggunakan Linux','Petani Kode',24,'Petani Ngewe',2019,2002,'A-34'),
(8,'Seberpang','Boolang',150,'Penerbit',2077,2002,'A-35');

/*Table structure for table `member` */

DROP TABLE IF EXISTS `member`;

CREATE TABLE `member` (
  `id_member` int(11) NOT NULL AUTO_INCREMENT,
  `m_nik` varchar(20) NOT NULL,
  `nama` varchar(24) DEFAULT NULL,
  `alamat` varchar(24) DEFAULT NULL,
  `kelamin` varchar(24) DEFAULT NULL,
  `no_tilpun` varchar(13) DEFAULT NULL,
  PRIMARY KEY (`id_member`)
) ENGINE=InnoDB AUTO_INCREMENT=23 DEFAULT CHARSET=utf8mb4;

/*Data for the table `member` */

insert  into `member`(`id_member`,`m_nik`,`nama`,`alamat`,`kelamin`,`no_tilpun`) values 
(20,'200200200','sopo','gaero','Laki-laki','14045'),
(21,'200200201','jarwo','gaero','Laki-laki','14046'),
(22,'12234566789','pelerkuda','gresik','Perempuan','021212121212');

/*Table structure for table `peminjaman` */

DROP TABLE IF EXISTS `peminjaman`;

CREATE TABLE `peminjaman` (
  `id_peminjaman` int(11) NOT NULL AUTO_INCREMENT,
  `id_buku` int(11) NOT NULL,
  `id_member` int(11) NOT NULL,
  `tgl_selang` varchar(24) NOT NULL,
  `tgl_kembali` varchar(24) NOT NULL,
  `status` varchar(200) NOT NULL,
  `banyak` int(11) NOT NULL,
  `id_user` int(11) NOT NULL,
  PRIMARY KEY (`id_peminjaman`)
) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=utf8mb4;

/*Data for the table `peminjaman` */

insert  into `peminjaman`(`id_peminjaman`,`id_buku`,`id_member`,`tgl_selang`,`tgl_kembali`,`status`,`banyak`,`id_user`) values 
(6,1,21,'1','1','1',1,1),
(7,2,20,'2','2','2',2,1),
(9,8,22,'22','20001202','Sudah dikembalikan',1,1),
(10,1,22,'22','22','Belum dikembalikan ',1,1);

/*Table structure for table `pengembalian` */

DROP TABLE IF EXISTS `pengembalian`;

CREATE TABLE `pengembalian` (
  `id_pengembalian` int(11) NOT NULL AUTO_INCREMENT,
  `id_buku` int(11) DEFAULT NULL,
  `id_member` int(11) DEFAULT NULL,
  `tgl_selang` varchar(24) DEFAULT NULL,
  `tgl_balik` varchar(24) DEFAULT NULL,
  `kembali` varchar(30) DEFAULT NULL,
  `status` varchar(200) DEFAULT NULL,
  `banyak` int(11) DEFAULT NULL,
  `id_user` int(11) DEFAULT NULL,
  PRIMARY KEY (`id_pengembalian`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8mb4;

/*Data for the table `pengembalian` */

insert  into `pengembalian`(`id_pengembalian`,`id_buku`,`id_member`,`tgl_selang`,`tgl_balik`,`kembali`,`status`,`banyak`,`id_user`) values 
(2,8,22,'22','20001202','20001203','Dikembalikan tidak tepat waktu, didenda Rp.500 per hari',1,1),
(3,8,22,'22','20001202','20001204','Dikembalikan tidak tepat waktu, didenda Rp.500 per hari',1,1);

/*Table structure for table `user` */

DROP TABLE IF EXISTS `user`;

CREATE TABLE `user` (
  `id_user` int(11) NOT NULL AUTO_INCREMENT,
  `username` varchar(24) NOT NULL,
  `pawot` varchar(24) NOT NULL,
  `nama` varchar(24) DEFAULT NULL,
  `u_nik` varchar(24) DEFAULT NULL,
  `u_alamat` varchar(24) DEFAULT NULL,
  `u_no_tilpun` varchar(24) DEFAULT NULL,
  PRIMARY KEY (`id_user`)
) ENGINE=InnoDB AUTO_INCREMENT=14 DEFAULT CHARSET=utf8mb4;

/*Data for the table `user` */

insert  into `user`(`id_user`,`username`,`pawot`,`nama`,`u_nik`,`u_alamat`,`u_no_tilpun`) values 
(1,'afal','fal','afal','1212323132231','jalan raya','087654321123'),
(12,'wukualam','wuku','wukualam','12121212121212','jalan kampung','088098890989'),
(13,'naufal','naufal','naufal','1101770134546','jalan lebar','083333221123');

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
