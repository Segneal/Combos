-- MySQL dump 10.13  Distrib 8.0.15, for Win64 (x86_64)
--
-- Host: localhost    Database: combos
-- ------------------------------------------------------
-- Server version	8.0.15

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
 SET NAMES utf8 ;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `localidades`
--

DROP TABLE IF EXISTS `localidades`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `localidades` (
  `idLocalidad` int(11) NOT NULL AUTO_INCREMENT,
  `nombre` varchar(45) DEFAULT NULL,
  `idProvincia` int(11) DEFAULT NULL,
  PRIMARY KEY (`idLocalidad`),
  KEY `loc_prov_idx` (`idProvincia`),
  CONSTRAINT `loc_prov` FOREIGN KEY (`idProvincia`) REFERENCES `provincias` (`idProvincia`)
) ENGINE=InnoDB AUTO_INCREMENT=25 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `localidades`
--

LOCK TABLES `localidades` WRITE;
/*!40000 ALTER TABLE `localidades` DISABLE KEYS */;
INSERT INTO `localidades` VALUES (1,'Lanus',2),(2,'Lomas de Zamora',2),(3,'Esteban Echeverria',2),(4,'La Matanza',2),(5,'Moron',2),(6,'Rafaela',1),(7,'Venado Tuerto',1),(8,'Rosario',1),(9,'Santa Fe',1),(10,'Posadas',6),(11,'Chubut',8),(12,'Santa Cruz',9),(13,'Avellaneda',2),(14,'Ezeiza',2),(15,'Quechuan',10),(16,'Riojana',3),(17,'Matadero',5),(18,'Sanchu',4),(19,'Sica',7),(20,'La Quiaca',10),(21,'Robertina',11),(22,'Silverina',12),(23,'Michua',13),(24,'Tekelon',14);
/*!40000 ALTER TABLE `localidades` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `provincias`
--

DROP TABLE IF EXISTS `provincias`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `provincias` (
  `idProvincia` int(11) NOT NULL AUTO_INCREMENT,
  `nombre` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`idProvincia`)
) ENGINE=InnoDB AUTO_INCREMENT=15 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `provincias`
--

LOCK TABLES `provincias` WRITE;
/*!40000 ALTER TABLE `provincias` DISABLE KEYS */;
INSERT INTO `provincias` VALUES (1,'Santa Fe'),(2,'Buenos Aires'),(3,'La Rioja'),(4,'San Juan'),(5,'San Luis'),(6,'Misiones'),(7,'Rio Negro'),(8,'Chubut'),(9,'Santa Cruz'),(10,'Neuquen'),(11,'Chaco'),(12,'Entre Rios'),(13,'Tucuman'),(14,'Santiago del Estero');
/*!40000 ALTER TABLE `provincias` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `sucursales`
--

DROP TABLE IF EXISTS `sucursales`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `sucursales` (
  `idSucursal` int(11) NOT NULL AUTO_INCREMENT,
  `nombre` varchar(45) DEFAULT NULL,
  `idLocalidad` int(11) DEFAULT NULL,
  `direccion` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`idSucursal`),
  KEY `suc_loc` (`idLocalidad`),
  CONSTRAINT `suc_loc` FOREIGN KEY (`idLocalidad`) REFERENCES `localidades` (`idLocalidad`)
) ENGINE=InnoDB AUTO_INCREMENT=40 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `sucursales`
--

LOCK TABLES `sucursales` WRITE;
/*!40000 ALTER TABLE `sucursales` DISABLE KEYS */;
INSERT INTO `sucursales` VALUES (1,'Marquez',1,'Sarasa 123'),(2,'Fravega',4,'Saracatunga 123'),(3,'Garbarino',6,'Sarandunga 123'),(11,'Marcasa',3,'fakestreet 234'),(12,'lilo',7,'Agandunsa 321'),(13,'Sere',8,'Agandunsa 321'),(14,'Sarandunga',1,'Agandunsa 321'),(15,'Meketrefe',1,'Agandunsa 321'),(16,'Gandalf',6,'Agandunsa 321'),(17,'Lalolanda',11,'Agandunsa 321'),(18,'Baranda',12,'Agandunsa 321'),(19,'Veter',13,'Agandunsa 321'),(20,'DEgray',13,'Agandunsa 321'),(21,'Arnolgray',14,'Agandunsa 321'),(22,'Ebola',5,'Labola'),(23,'asd',2,'asd'),(24,'Mata',17,'mata'),(25,'Meketrefe',11,'123'),(26,'TekelonAr',24,'Artekelon 123'),(27,'Entre los dos rios',22,'sarasa'),(28,'BlackRiver',19,'Kuro'),(29,'Queuen',15,'Laquica 123'),(30,'Cocho',21,'Carpincho macho'),(31,'MatandoVacas',17,'palasadito'),(32,'Serese',2,'asd 123'),(33,'milena',2,'bolu'),(34,'sarasa',11,'sarasa'),(35,'Elchiqui',10,'tito'),(36,'Namantuc',23,'Tucumantuc'),(37,'Gasgas',22,'Gas'),(38,'Sorario',7,'mercal'),(39,'Dabien',21,'anda 456');
/*!40000 ALTER TABLE `sucursales` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping events for database 'combos'
--

--
-- Dumping routines for database 'combos'
--
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2019-09-19 14:22:04
