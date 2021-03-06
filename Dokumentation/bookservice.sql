CREATE DATABASE  IF NOT EXISTS `bookservice` /*!40100 DEFAULT CHARACTER SET latin1 */;
USE `bookservice`;
-- MySQL dump 10.13  Distrib 5.6.17, for Win32 (x86)
--
-- Host: localhost    Database: bookservice
-- ------------------------------------------------------
-- Server version	5.6.20

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
-- Table structure for table `author`
--

DROP TABLE IF EXISTS `author`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `author` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `title` varchar(45) DEFAULT NULL,
  `firstname` varchar(100) NOT NULL,
  `lastname` varchar(100) NOT NULL,
  `birthday` datetime NOT NULL,
  `nationality` varchar(10) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `author`
--

LOCK TABLES `author` WRITE;
/*!40000 ALTER TABLE `author` DISABLE KEYS */;
/*!40000 ALTER TABLE `author` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `book`
--

DROP TABLE IF EXISTS `book`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `book` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `fk_publisher` int(11) NOT NULL,
  `isbn` varchar(45) NOT NULL,
  `title` varchar(100) NOT NULL,
  `subtitle` varchar(100) DEFAULT NULL,
  `description` varchar(200) NOT NULL,
  `pages` varchar(5) NOT NULL,
  PRIMARY KEY (`id`),
  KEY `fk_publisher_idx` (`fk_publisher`),
  CONSTRAINT `fk_publisher` FOREIGN KEY (`fk_publisher`) REFERENCES `publisher` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `book`
--

LOCK TABLES `book` WRITE;
/*!40000 ALTER TABLE `book` DISABLE KEYS */;
/*!40000 ALTER TABLE `book` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `book2author`
--

DROP TABLE IF EXISTS `book2author`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `book2author` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `fk_book` int(11) NOT NULL,
  `fk_author` int(11) NOT NULL,
  PRIMARY KEY (`id`),
  KEY `fk_book_idx` (`fk_book`),
  KEY `fk_author_idx` (`fk_author`),
  CONSTRAINT `fk_author` FOREIGN KEY (`fk_author`) REFERENCES `author` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_book` FOREIGN KEY (`fk_book`) REFERENCES `book` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `book2author`
--

LOCK TABLES `book2author` WRITE;
/*!40000 ALTER TABLE `book2author` DISABLE KEYS */;
/*!40000 ALTER TABLE `book2author` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `publisher`
--

DROP TABLE IF EXISTS `publisher`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `publisher` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(100) NOT NULL,
  `streetname` varchar(100) DEFAULT NULL,
  `streetnumber` varchar(45) DEFAULT NULL,
  `postcode` varchar(10) NOT NULL,
  `countrycode` varchar(10) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `publisher`
--

LOCK TABLES `publisher` WRITE;
/*!40000 ALTER TABLE `publisher` DISABLE KEYS */;
/*!40000 ALTER TABLE `publisher` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

DROP TABLE IF EXISTS user_role;
DROP TABLE IF EXISTS user;
DROP TABLE IF EXISTS role;

CREATE TABLE user (
  userid INT AUTO_INCREMENT PRIMARY KEY,
  username VARCHAR(25) NOT NULL,
  password VARCHAR(128) NOT NULL
);

CREATE TABLE role (
  roleid INT AUTO_INCREMENT PRIMARY KEY,
  rolename VARCHAR(25) NOT NULL
);

CREATE TABLE user_role (
  userroleid INT AUTO_INCREMENT PRIMARY KEY,
  userid INT NOT NULL,
  roleid INT NOT NULL,
  FOREIGN KEY (userid) REFERENCES user(userid),
  FOREIGN KEY (roleid) REFERENCES role(roleid)
);

INSERT INTO user (userid, username, password) VALUES (1, 'stefan', SHA2('write', 512));
INSERT INTO user (userid, username, password) VALUES (2, 'georg', SHA2('write', 512));
INSERT INTO user (userid, username, password) VALUES (3, 'guest', SHA2('read', 512));

INSERT INTO role (roleid, rolename) VALUES (1, 'BSWrite');
INSERT INTO role (roleid, rolename) VALUES (2, 'BSRead');

INSERT INTO user_role (userid, roleid) VALUES (1, 1);
INSERT INTO user_role (userid, roleid) VALUES (2, 1);
INSERT INTO user_role (userid, roleid) VALUES (3, 2);
-- Dump completed on 2014-10-20 17:47:25
