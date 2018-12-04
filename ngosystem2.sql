-- MySQL dump 10.13  Distrib 5.7.17, for Win64 (x86_64)
--
-- Host: localhost    Database: ngosystem
-- ------------------------------------------------------
-- Server version	5.6.40-log

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `dailycollection`
--

DROP TABLE IF EXISTS `dailycollection`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `dailycollection` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(30) NOT NULL,
  `gender` varchar(30) NOT NULL,
  `address` varchar(30) NOT NULL,
  `Amount` varchar(30) NOT NULL,
  `collectionDate` date DEFAULT NULL,
  `m_code` varchar(10) NOT NULL,
  `day` int(11) DEFAULT NULL,
  `month` int(11) DEFAULT NULL,
  `year` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `m_code` (`m_code`),
  CONSTRAINT `dailycollection_ibfk_1` FOREIGN KEY (`m_code`) REFERENCES `member` (`mcode`)
) ENGINE=InnoDB AUTO_INCREMENT=27 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `dailycollection`
--

LOCK TABLES `dailycollection` WRITE;
/*!40000 ALTER TABLE `dailycollection` DISABLE KEYS */;
INSERT INTO `dailycollection` VALUES (8,'Mahabub','Male','Dhaka','50','2017-01-11','0014',4,11,2018),(9,'Shakil','Male','Khatuadanga','50','2018-12-04','0015',4,11,2018),(10,'Mustafiz','Male','Tangail','50','2018-12-04','0016',4,11,2018),(11,'Mehede','Male','Kakam','50','2018-12-04','0017',4,11,2018),(12,'Shofiq Vai','Male','Postogola','50','2018-12-04','0018',4,11,2018),(13,'Susmi ','FeMale','Azimpura','50','2018-12-04','0019',4,11,2018),(14,'Moly nahar','FeMale','Mohammadpur','50','2018-12-04','0020',4,11,2018),(15,'Sojodis Saha','Male','Mohammadpur','50','2018-12-04','0021',4,11,2018),(16,'Sojodis ','Male','KaliNogor','50','2018-12-04','0022',4,11,2018),(17,'Sojodis ','Male','KaliNogor','50','2018-12-04','0022',4,11,2018),(18,'Sojodis ','Male','KaliNogor','50','2018-12-04','0022',4,11,2018),(19,'Maliha Roy','Female','Komilla','50','2018-12-04','0023',4,11,2018),(20,' Rozina','Female','NarayonGong','50','2018-12-04','0024',4,11,2018),(21,' Rozina Mrs','Female','NarayonGong 2','50','2018-12-04','0025',4,11,2018),(22,'Jamal Mia','Male','Sylhet','50','2018-12-04','0026',4,11,2018),(23,' Mia Molla','Male','Hazigong','50','2018-12-04','0027',4,11,2018),(24,'Mahabub','Male','Dhaka','50.0','2018-12-04','0014',4,11,2018),(25,'Shakil','Male','Khatuadanga','50.0','2018-12-04','0015',4,11,2018),(26,'Mehede','Male','Kakam','50.0','2018-12-04','0017',4,11,2018);
/*!40000 ALTER TABLE `dailycollection` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `member`
--

DROP TABLE IF EXISTS `member`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `member` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `mcode` varchar(10) NOT NULL,
  `username` varchar(30) NOT NULL,
  `gender` varchar(30) NOT NULL,
  `mobileno` varchar(11) NOT NULL,
  `nid` varchar(30) NOT NULL,
  `address` varchar(30) NOT NULL,
  `admitfee` int(30) NOT NULL,
  `regiDate` date DEFAULT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `mcode` (`mcode`)
) ENGINE=InnoDB AUTO_INCREMENT=18 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `member`
--

LOCK TABLES `member` WRITE;
/*!40000 ALTER TABLE `member` DISABLE KEYS */;
INSERT INTO `member` VALUES (1,'222','kkk','Male','01722932483','2541857496','Dhaka',150,'2018-12-01'),(2,'0012','Milton','Male','01722932483','0102326547','Khulna',150,'2018-12-04'),(3,'0013','Mortoza','Male','01722932482','0102326547','Monirumpur',150,'2018-12-04'),(4,'0014','Mahabub','Male','01722932452','0102326574','Dhaka',150,'2018-12-04'),(5,'0015','Shakil','Male','01425263255','526341789','Khatuadanga',150,'2018-12-04'),(6,'0016','Mustafiz','Male','0142526374','52634178915','Tangail',150,'2018-12-04'),(7,'0017','Mehede','Male','01722945863','147258963','Kakam',150,'2018-12-04'),(8,'0018','Shofiq Vai','Male','01722945963','14725896352','Postogola',150,'2018-12-04'),(9,'0019','Susmi ','FeMale','01722945961','147258963','Azimpura',150,'2018-12-04'),(10,'0020','Moly nahar','FeMale','0172294594','1472589631','Mohammadpur',150,'2018-12-04'),(11,'0021','Sojodis Saha','Male','0174859663','963258741','Mohammadpur',150,'2018-12-04'),(12,'0022','Sojodis ','Male','0174859663','963258741','KaliNogor',150,'2018-12-04'),(13,'0023','Maliha Roy','Female','01788529632','258963147','Komilla',150,'2018-12-04'),(14,'0024',' Rozina','Female','01788529632','258963147','NarayonGong',150,'2018-12-04'),(15,'0025',' Rozina Mrs','Female','01788529632','258963147','NarayonGong 2',150,'2018-12-04'),(16,'0026','Jamal Mia','Male','02966325478','258963147','Sylhet',150,'2018-12-04'),(17,'0027',' Mia Molla','Male','0296632544','258963147','Hazigong',150,'2018-12-04');
/*!40000 ALTER TABLE `member` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `user`
--

DROP TABLE IF EXISTS `user`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `user` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `username` varchar(30) NOT NULL,
  `password` varchar(30) NOT NULL,
  `usertype` varchar(30) NOT NULL,
  `gender` varchar(30) NOT NULL,
  `mobileno` varchar(11) NOT NULL,
  `nid` varchar(30) NOT NULL,
  `address` varchar(30) NOT NULL,
  `admitfee` int(30) NOT NULL,
  `regiDate` date DEFAULT NULL,
  `status` bit(1) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `user`
--

LOCK TABLES `user` WRITE;
/*!40000 ALTER TABLE `user` DISABLE KEYS */;
INSERT INTO `user` VALUES (1,'Milton','1234','Admin','Male','01722932483','12121546362','Dhaka',150,'2018-12-01',''),(2,'Mortoza','1234','Field Assistant','Male','01722932841','123654789963','Jessore',150,'2018-12-02','');
/*!40000 ALTER TABLE `user` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2018-12-04 13:39:35
