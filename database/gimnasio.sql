-- MySQL dump 10.13  Distrib 8.0.42, for Win64 (x86_64)
--
-- Host: localhost    Database: gym
-- ------------------------------------------------------
-- Server version	8.0.42

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `administrador`
--

DROP TABLE IF EXISTS `administrador`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `administrador` (
  `administrador_id` int NOT NULL AUTO_INCREMENT,
  `nombre_completo` varchar(100) NOT NULL,
  `correo_electronico` varchar(100) NOT NULL,
  `telefono_contacto` varchar(15) NOT NULL,
  `huella_dactilar` blob NOT NULL,
  `password` varchar(10) DEFAULT NULL,
  PRIMARY KEY (`administrador_id`),
  UNIQUE KEY `correo_electronico` (`correo_electronico`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `administrador`
--

LOCK TABLES `administrador` WRITE;
/*!40000 ALTER TABLE `administrador` DISABLE KEYS */;
INSERT INTO `administrador` VALUES (1,'garrix','garrixcano7@gmail.com','9541857556',_binary '\0�\�\0\�*\�s\\�A7	�q�\�U�\�x\�Zc�2\�i\�ea|\�b�n[�\";\�\�\�\���[�\�W2Y�\�x�\�V\0��pX�\"\���Q�j�	\�{P\�\�կJ�v�\�B^\0^\�\�V�\�\�\nS�����Q�I$\�bw&:���ub���̽\�\�jX\�N\�\�\n�!�m\�ɖU$��q\� \�4`\�k�\���3$C\�%\�\�}W\���\�{o<�iWe\�J��\���\�*����B\�\�9\Z:��>H	\�o\�w#�\Zn.Yo\0�\�\0\�*\�s\\�A7	�q�\�U�ς\����f(\�4�6���^�	\�C��\�\�ܸy�f\�\�\�s�\�\�\"\�`�Ї&�\�I#��|K<\"�Ż^\'\'\�s�l]A$�\��\�vvȭ\ni\�u\�O��\\e\�9+Y0b0|�\�~�?�*�.ǟ\�*\��F`�ͧ��Ψ��o\���꩓\�N\�\�\�|\�?|?,Y�\�S\r�AK\�,k�3ak\�@�\�\��I�h_�(��\\լ$:\�鑾̺�I#\�\Z��B�OS\�\�\r\�\�8\�$�.r\�x\�o\0�\�\0\�*\�s\\�A7	�qp\�U�%׏��`�tǐ\rj%�b-L\�Z\�(�a yZ��szge�\Z�R��ˇ�\�ԅT��շcvF$��\�ߧ�Ay�\r�\�-J$\�\�x|9��Ofj��>\�2?��֌��NOӝ}a��8��u�0ŭ5H\"W\'�u�\�\Z?/\�b�:c�J�!%�nM2=�`D@B-x.V���e�,�3E~�@Yas�K�\�\�A�\�Ĺ�\�\�.\�]7��\�\�\ZA�w�o\0\��\0\�*\�s\\�A7	�qp\�U���\��:�A[�mE\'A���.:\n=�p\�\�.F\�a\�\�ef���3se\���\�7g�TX�!Vь������\�y��\�\rn�ˏ2ϯ\��U��m5�Q�M;\�Op��\�T˓)>\�h�4C:���	�?n_b|\�}�01�\�k��\�\�~!/o�\�\�\��\�!\�;\��.:doG\'J��\���SX���}�BD&G\�jl�Caj\�D\�ՕM�\�F̌����ۙݵIaq/�����T\�<\����VMyo\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0','admin'),(2,'Jose','luis.herrera@admin.com','5553334455',_binary '\0�~\�*\�s\\�A7	�q�U��C�|}\�7��],G\��Y�EC��N�G�N�\0��\�~���2\�U�w\��4}\�	�X	\Z�m=�\�l����n�\��^%ʑ�\�Z\�\�*p����LM�\�c�pEZ9�\�5\���ꌻ\�\"��\�5i�p\�$zlVs_\�\�?�.\���\�-<�\�D\�϶S�\�A9���#\������\�,<�kc�)��zg)d\��\�0�\rڿ�ً�4��f0bp��FG�,t�\�A?\�{�dר(C\�*xu�� *Ȳ��2|gVj�0\0\�\"ͫ�S�\�/�2�B�C$q\�x��_V�\��v��ݮ�\�\�l\�Q�\rA�m�iU�\�\�\r��V�\�\n4gʃ<uL3F�0i�G,T\���s�p\n�]\00R3Ѫ@(\�>\�ު�\�ܳ#E\�o\0��\�*\�s\\�A7	�qp�U�\�\r�\�p�|<:�̞��Y&h\���b-��y`�2\�}҉��\�C�\�(x>b4�L`�I�\�-�L�r$#5x������\���3\�/�w9\�jS\�\���;r\�u�Ib�^-�tYN����\�\�\0��Yj�D\��Wkm@���a\�\�:/�\�j�\�\�%�a]B���\n\"\�\�A0��r�\�*��>)d`�\�#��\�@�	�tIv\�\�]Ip\�\��\�\Z\r�_+��3C\�\�\�s�x\�`���D���\�ɖF+\r�Ũ\��3\0}v�\�$�W]ۆ\�Rj���Z���\���nC����;nK��T6/\��,��\�N\�Zow_u\�\�.#�j��_��\�N\�\�<M8�{6��k�\�ɭsP�ĂP���7h��\�\�:\'9�AC�T�)_0�Z�o\0�\�*\�s\\�A7	�q0�U��f9\�.Ib�c\��cg?�n\�\�=��猛�,\��8O:�Kk��b\r�)\�0#$�\�9�W�\�\�\��\\�\���ʇ�K)���o~p2<��\��Y	7\�\�WЗ�o몽�\�\�62�\�uL#%���,\�A�\�	\�\�B;׋!�\�82�c���6��\�tT���;��&%o�=0j&\�Yb\�O�8T֫s�\�\�\��d\�4	��)�\nē����.�S�;�\���w��\�\�Ռ\"\�A���ҵ�k��\��\�9?�A�v�C\�\�|��D��\��>o\�\�-\�Q�����\�Y\�\�@ra\�k\�]\�}xc�\r�\\�\Zf\0�P��u�b�\\�f.�ū�\�@\r6�UO��C?\n\�H�G�{9\�\�r;�j�Fe�\�?.���\�o\'x.ţ�?�o\0\�\�*\�s\\�A7	�qpMU�/�u�jiBo�va\�\�-\�-\�\"͌7b\'\�e�V��LE\�̀i�\�_�\0%\Z\'\\�?r𖩉\�(�\�z8����\�.	m�!~�\�\�~;�߹�30�H\�\�\�\�\�/���\�P=q��\�aPV�\�	c�\�i��D2\�ȭ\�,%\��\�\��\�sJs>6��Q_������ž5��K2�m��gs=E�0��ƴm\��9;\�q]��\0gbH�c�C@�\�A�-?\�c�\�zS\��MfP����˔�{��\�\���\�\�\'�\�oAHt\�Y\��`p�ϳ6\��7x\�6ά2�\�\�\�x\'�$d\'�\���\�nmJ�\�Z��BDk�M��;\0=��f��\�\���\�FԂV\�Aj�A�?S&,$\�\�\�$\n�~�f}bp{���	����\��~\�_�\����o\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0','2701'),(5,'miguel','gatitahot@gmail.com','9293949495',_binary '\0�s\�*\�s\\�A7	�q��U�<�9���q�\�\'��\��j*\��٣5�\�\r�W���\'�\�kıDKvR���R\Z�#VDNl�<?^�\�H\r.�&���\��e+O�Wd?,*Ǔ�|��s��L~T;\��\�@XL��l�3C��\�	�My`47\��\�KΕ،�+��M\�{\�zd��x6ۏN~\�n��Ϧ.\�@�ف\�t.>�\�\�o�Y\�* �wA��,��W\�\�$F\�\�=#㾈�	>\�\�?�b�E\��a�\�|t\�\��\��E@�Z�$�X�DK��\�\Z�\����x�6-z\�\��)��ӣ��}|�]������\�\�*�\� 4Z/{�\�\�Q��ѼS\�&-�\�Z\n=݊�uMp�:@��\�0+#�!�>�\�o\0�A\�*\�s\\�A7	�q0�U�6�\�茓����s7צ\�L�\0\�\�ҝ�:�\��7�\�.�/����cj�l�\��D�\�n7i6L�j�\�k�\�\�Ӓ\�#�\�\�\�\'^d�d�gC��J����v�IӪyWD�hvҰ�;oZ��8S��WfәS��v\�F�\�ȶx�`N}�\�j	D\\\�y���w`�\�>�G\�kU����!ǌ h+ZIjBU�I8�z�\�ے\�ۊ�K\��ke]�@?��\��\��?\�t:���)����֩��������5_�p�\��:\�\r\�\�2\0\�3L��y��\�\�S4�\��o��\�\���`q\�o\0�:\�*\�s\\�A7	�q0�U���[��Vl/,��8s0���E�����W\n\�/�|\�J[0�^\0y���0�=d�j\�\�	�\�ʅ�M\�\�3��\�q\�X�[u�cM\�LG��?\�}��\�>�wg�ȡ�\�xHj�0�7�\��\�\�ԉ1۵\�\��e\�\�\�W�@I�\�\�\n~+���EJ�\�Sb���z�\\a$6{J�\�\��\\J�4�\�L\n\��\\XG�Gj�=��v�غ��K�\�R���*��l\'\���p�mU\�\�V&K\�Z%\��{K֑�!!�&\"�i� ��%�\r\�>���o�\�8\�(*%��?��|�1Urt#� �P�\�o\0\�1\�*\�s\\�A7	�q��U��\�\�i8��]\�\�\Z\�׎�H��+�\�\�5K\�\�~x\�\�X���|�mڦc\�z�	�&a�\�L��\�E%!W\�R>\�ȨS�\��kY\�ƇJ��\�2�\�\�\�}R�d{�\�yM�*�\�\�a�rf\�quJ ���jI8�\�a\�T��t}0�\�\'\�J�ǌ\�W*��6�Ldb���v\�Q��~�\��imߦ��\�0&�7\�1^%ZA\�-���a��\����\�\�(O��UE!\�\�j\�\�zDd\�Lƕd%eh�k�\�\�$+�4	\�\�T&)�2]i�\n@\\\��S���F~\��F�4\��3\"O}�}o\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0','1234');
/*!40000 ALTER TABLE `administrador` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `asistencia`
--

DROP TABLE IF EXISTS `asistencia`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `asistencia` (
  `asistencia_id` int NOT NULL AUTO_INCREMENT,
  `fecha_hora_entrada` datetime NOT NULL,
  `fecha_hora_salida` datetime DEFAULT NULL,
  `cliente_id` int NOT NULL,
  PRIMARY KEY (`asistencia_id`),
  KEY `cliente_id` (`cliente_id`),
  CONSTRAINT `asistencia_ibfk_1` FOREIGN KEY (`cliente_id`) REFERENCES `clientes` (`cliente_id`) ON DELETE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `asistencia`
--

LOCK TABLES `asistencia` WRITE;
/*!40000 ALTER TABLE `asistencia` DISABLE KEYS */;
INSERT INTO `asistencia` VALUES (6,'2025-05-25 15:55:21',NULL,17),(7,'2025-05-25 16:01:06',NULL,1),(8,'2025-05-26 14:08:58',NULL,20);
/*!40000 ALTER TABLE `asistencia` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `asistenciaentrenador`
--

DROP TABLE IF EXISTS `asistenciaentrenador`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `asistenciaentrenador` (
  `asistencia_id` int NOT NULL AUTO_INCREMENT,
  `entrenador_id` int NOT NULL,
  `fecha_hora_entrada` datetime NOT NULL,
  `fecha_hora_salida` datetime DEFAULT NULL,
  PRIMARY KEY (`asistencia_id`),
  KEY `entrenador_id` (`entrenador_id`),
  CONSTRAINT `asistenciaentrenador_ibfk_1` FOREIGN KEY (`entrenador_id`) REFERENCES `entrenador` (`entrenador_id`) ON DELETE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `asistenciaentrenador`
--

LOCK TABLES `asistenciaentrenador` WRITE;
/*!40000 ALTER TABLE `asistenciaentrenador` DISABLE KEYS */;
INSERT INTO `asistenciaentrenador` VALUES (1,1,'2024-06-05 07:50:00','2024-06-05 12:10:00'),(2,2,'2024-06-06 15:45:00','2024-06-06 20:05:00');
/*!40000 ALTER TABLE `asistenciaentrenador` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `clientes`
--

DROP TABLE IF EXISTS `clientes`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `clientes` (
  `cliente_id` int NOT NULL AUTO_INCREMENT,
  `nombre_completo` varchar(100) NOT NULL,
  `correo_electronico` varchar(100) NOT NULL,
  `telefono_contacto` varchar(15) NOT NULL,
  `fecha_registro` date NOT NULL,
  `huella_dactilar` blob NOT NULL,
  PRIMARY KEY (`cliente_id`),
  UNIQUE KEY `correo_electronico` (`correo_electronico`)
) ENGINE=InnoDB AUTO_INCREMENT=21 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `clientes`
--

LOCK TABLES `clientes` WRITE;
/*!40000 ALTER TABLE `clientes` DISABLE KEYS */;
INSERT INTO `clientes` VALUES (1,'Osmar González','osmar.gonza@gmail.com','5551234567','2024-06-01',_binary '\0�\�*\�s\\�A7	�q�\�U�I՗z�1�\�#\�\�\��\�\�d��M\�7��4V|�1⾊����\�/h��\��-�\�2˥��=�w\�h;g\�\�\0g\�/\�\�\nt��U\r�H&�p�R\�\���7%C���hb�\�~\�\�3S��\Z\�\�+n�\�yq1��\�8\�8�gl\�\�4l�ĉfJx|]T��h�\�\�x\�\�,�\�xv\�\�#\"Z!�^K\�|I��� �\�u�-si�E��1-WQ@�\��V�v\�}r%�\�\��P\�4ɘ�\�\�9\��xpE*E\�\�ۏ*-]�{\�DN\�ey׈�\�b�5o\0��\0\�*\�s\\�A7	�q0\�U�Ȯ�E[�R\�xx�ce\���\�5f\�v����n��ރo����bY\�\�h)�S\�\�@\�\�\� ?>\�-r>m\�j<)\�2��m��w�	>��᧨�iv�! k�1d\�d\�X�g��5\�ε�\�)��P@��-��\���\Z*/m�;N\�6qn�L\"^:����M\"��fl[\�<\�%� °\��` \�n\rj\�PW�\��.���\�q\��\��ؗ�\��pd��&��\�g�&�.P��&����ٖ�s�iueo\0�<\�*\�s\\�A7	�q�\�U��6 0\'R\�\��\ZP�3He\�O�\�\�	j0&���%w�����gp,v藰�\��m\\C�L\�C|�{e7S\riz-�U\�4F󸳈�i�iN��)\�a�͈��\�M\0I��~\0:��x�\�\�\�r$Ys0�\�\'\\\�m\�\��SVz\�ޕԌu��&8���fk%�Rq�ܞ��mz�b��=!��\�>a�c�\�\0�C��7IbFi3m6��\�\���O�>�q�%.q�r]P۔{�*�!\��.4h\"\�oە0�\�\�hzS\�\�rz7!U\��~��@��L��,�\�&�-z0����{~�oփ��a\�0D��T�\�W\��6Ko\0\��\0\�*\�s\\�A7	�q�\�U�إgz\�?\�މnv؀8�\�3�@ϴ��^FPϖ�R�\":�!kcB��LK\�cm�Fej\�����p.ǔ�@\n?\�\�K;�?Fg<�p��1��3]�\� mrd6!�\�̮���^a�:.[\�s\Z\�R�\�.�����hdd��\�݊��_q�/�\n\��Z�aO�̉\r�\�\�=\�Z4\�?֫�D\�\�Z�4��L��9 �qr�c�\�\�#�XQ#f\� \�\��\�\�G��z>2F�\�\�ȶ\�Oo\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0'),(2,'Carlos Cano','carlos.can@hotmail.com','5559876543','2024-06-02',_binary '\0�Q\�*\�s\\�A7	�q�\�U�}\�\�Hr�-u,,�_\�y��iMn\���\�W\��5�\�\�\�	\�\��\�x�\�\�O \�a�R��\��M,��\"�!u\�O�y�`�\�\0�ş<�NNQ�\n�\��{a	��>0��\�\\S\�2)��\��o�;:y�\���R);�ȼq)�\Z�o\�\�\�\�(IB\�\�Q\��JD|�&56\�ƷQ�ذ�L��MvS���C7>�`���՛�N�\�5\��yk>\�\�\�Y�\���\"\�\'\�l��3�T\�A�Õ�j�;-�\�k\� +�e��\\��C����U�{K\��4\�\��K8��\ZP�����U��b�לg�qi;\�l��<(\�\�å �`�u)ȕQ;7҂�r��\�A�\�o\0�Q\�*\�s\\�A7	�q�\�U�}\�\�Hr�-u,,�_\�y��iMn\���\�W\��5�\�\�\�	\�\��\�x�\�\�O \�a�R��\��M,��\"�!u\�O�y�`�\�\0�ş<�NNQ�\n�\��{a	��>0��\�\\S\�2)��\��o�;:y�\���R);�ȼq)�\Z�o\�\�\�\�(IB\�\�Q\��JD|�&56\�ƷQ�ذ�L��MvS���C7>�`���՛�N�\�5\��yk>\�\�\�Y�\���\"\�\'\�l��3�T\�A�Õ�j�;-�\�k\� +�e��\\��C����U�{K\��4\�\��K8��\ZP�����U��b�לg�qi;\�l��<(\�\�å �`�u)ȕQ;7҂�r��\�A�\�o\0�L\�*\�s\\�A7	�q�\�U�a�\��\�@U�m.�V�f�	FI \�ߥ���9Q�j����\�\�|�י\�\�C�\�Q>{\r}\�+�B��d.\��F����=Ըܺ�_�\rVd�@t�8�\�\�\�`?\�\�5\��L8\�m\�S`��-�}\'N\���\\�e\�Dr�=\�\�\\��M�y\�.�4[�$ڈ-\�C\����H\"�㬿C	ו^\�\�\�#p\��_;w�\�̾�#\�<c�\n:\�_��\���G�(Y�Uj�ib\�/WѪ�g�æ��Q�E�cU\���X���\�\'�|VUl4��V;}�%���\�(}\'����\����9\�AΑ\�RK\'\�N�hg4YO?F�a\�ۀ\�\Zo\0\�L\�*\�s\\�A7	�q�\�U�a�\��\�@U�m.�V�f�	FI \�ߥ���9Q�j����\�\�|�י\�\�C�\�Q>{\r}\�+�B��d.\��F����=Ըܺ�_�\rVd�@t�8�\�\�\�`?\�\�5\��L8\�m\�S`��-�}\'N\���\\�e\�Dr�=\�\�\\��M�y\�.�4[�$ڈ-\�C\����H\"�㬿C	ו^\�\�\�#p\��_;w�\�̾�#\�<c�\n:\�_��\���G�(Y�Uj�ib\�/WѪ�g�æ��Q�E�cU\���X���\�\'�|VUl4��V;}�%���\�(}\'����\����9\�AΑ\�RK\'\�N�hg4YO?F�a\�ۀ\�\Zo\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0'),(17,'Susana','sus@gmail.com','8273636363','2025-05-24',_binary '\0��\�*\�s\\�A7	�q��U�\�\�\�75\�h9\�mE�\0\�\�D\�v\�>jA!]\\^	�锎_m�;�\�db\0A���uwu\�\�\r$�dàv�?�FD�d�\���\���h�#D2\�\��\�h����m�\��W�`)\�eSXZ��\�9\�d|3Q�\�\�=]Q�M\�\�b2U\�C����(���b��������S\�V?,\'V�\�v�=\�[u�F�ǈ{8�Jd�I�_\�)�\�Y#����j�K3\�\nr�\r�u��f�\\ΧT\�V\�0���H_Z\�lX\�m\�\�)\�wE���\�V]k����uƌ4\�e�\�\�9��\�\�\r6�\�M\�&^�ɬu!\�x_g\��&�\'�/D�䥪�\0p��\�vU\�\�#U;\�wҐ\�BS��}MR��R�\�a��뙾��\�D\���wqWK��L�\�o\0��\�*\�s\\�A7	�q0�U��%�B[��&��\�\���\�8NkF9UV����J�߯\'\'OE\�>�$�\�\���JK��>�*�ߌ��h�/�`�\��\�Fˇ\�D�\�w\�a�e8uH���\r`\�x�{s�\�z.]�V��z\�.L\�d�Xk}W\�	�\�4�=cS\"�R��\�R��)܈B�r�\�eD�!I9�_>�o\�A�1\Z\�P)�hV�]p[\�E{Ӑ\�t7���^i��E�\\�]�\�׉E�,\�;\�A.�8\�0\�\��d��*�\�)ѳY�\0H?��aBH�]�\\��Ӏ�\�Á��\�\�i���\�\�)^x\�\�]�K\�̲\�G\�X\�\�J�\�?�$Y��6��P*\�\�`$)T�����:\���3��A2\�IG9%㳁\�f,���\�V���\n`X o+�\�8k��c;��o\0�\�*\�s\\�A7	�qp�U��F�\r@\�\����W�n�pܟrb]�U��&%=2��ZK�l�ǖ:FuYު\�0>\�E����Q�������1�z-~,\�\��\�\������7\0D�lW�8c�Oδy-~\"�8\� �@+Sʿ�_ɣ�\�<Lݲ�\�鳆�TJ�\�AŔy�.��\�3\�M\�O�c���\\$���GWo�# ll�L�\�\��\�\�\�\�\r�\";\�G�\Zp��\�C\�aN\��J\�a�y5P\�9HlY\��/E�V\��\�\n%0�E��\�8�YP\�>?1\�K*˳\�	�:!WL��F�\�F\�N\���*ҟ\�*#rjV+N~�XX#����T�\�g|�j.mIC�P�	{�%�\�Y`��_+O\�ݭ���[l�-������Y\r\�mo�\�\�W�~o\0\�\�*\�s\\�A7	�qp�U�O+���\�y\�\�\�\�U�_�ƉIP�\\�y�y�P;6\�?�I�B+���V;Rݱ\����a�\���]\�\�%�>��\�z\�uty���\�M\�\�Y�҃\�4�*`\�t@m�ǳ�u�hv�^\� �R$�`E{�2{E̦\��h�GLc[��\�\��\�F�eV�{乍=��\�V��\�wl��\�%\�C3\�\�Q�+|w�\�&c*\�`o��\������\n���%iRK��몕��Ɨ�BG)�{<���\�+�,�E@�\�4{\�\�_�����{�s,X/b\��\nx�\�%͈yP\��hXJC�\�aoxw\'g?^>�F:�\�\�i��\����b:-�؁\�̍3�\�0\�*�]7\�\�\�ը��DE����m=<\Z\�,�0ƭWJto\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0'),(18,'Candida','can@gmail.com','8888888888','2025-05-24',_binary '\0�\�*\�s\\�A7	�q�U�e�n\�}8\"�<�\�c��zq8�\�V�K�9���<�\���]\�l� B\�\n��\��p|�?�ΰSQ\�<\�J�~N!Ts�\�}\�ͤ�@��(Q\�T�\�ظ��6�\�\�`�\�\'Xi��+p\�\�\�\�^A/\�RΒ6Mr\��I!|��\�y\�\�@\�\�\�u\\M\�yN��=X��\�+\�\�\�`Y\�=�y+�\�L\�wN\�\Z�7:\�N�\�i�{�����s^B\r7`��Cz\��\��\'m?�c\�i\�޷\"L�l\�\���%�@o\� �ܘ\�\�\�\�׮X\�)�\�CE\�s�V\���=�8q\�F���\�\�iդU2�\�d,\�dJ\�[͝$@>E<��\�ˇM\Z�M�pd*o�|y�]Ɖ�G��F�\�nyZ�\�e\\N��\��Ǟ\�O~ho\0�\�*\�s\\�A7	�qp�U�h\"ؼ� \�\�H$,��<A=�leY\r�x��\�\�.IF\�ȣ�覰\�@_��%\��\�\nrD��bt�Rz\�v\�\��\�Z��13���[\�z��Z00�\��Q�\�OPH5�H�\�\�60\�\�s \'E�lbx&qIo<&J\�n�.D�m�(뒰\'2�\0\�Gh�\�T���װ3N`\�8M/\Z�Ɖ!l^��\�\�\�\�-b�G\�qx\�m�t��\�bهl\��\� 4�����m-\��%)\�S��)-��d3\�\�\�j*���\�X6����᤾ֵ�v�	_��\�;\�Տyu�p\�a�vk�\\�\�?O\�J�Ű\Z��<=p\�9(h\�\�ͪ:��V�&4Gw�\\\�dUU\�\�X�c�Q\�҈\�̭�:�v-u�����\�\�\�z_\npU4\�Z3�<\0��}Qo\0�~\�*\�s\\�A7	�qp�U�\�\�\r�ъ��ć\������brK�l�6g�\�?�|QE_���[H��%�?��\��50+\�;஻\�A\�\\\�*�\�\r��v\�u�<�j�yZ%�ƍˋ�֭��\\a:�=�J���ߗJd\"}~��i�颈�Dh�\�w\\H����@A��\��&�\�!u@B\�VQ�/\�\�^h�TN\��~�\���\�	\�-v�2�i,sw\�\�8d����\�p�A\�a�X1X�UYN��~\�R���R�^\�\�,y�:\�\\`\��	I��d��NV_�h]g��\��.��\�\�ߍ7�E]I�\�Es)y�K\�\r\�i�ϻ�^S�\�{���\�(�\�k6\�_>mzK1(/[S�j��*�\�0\�e���{p\�@#ۂ?�&\�\�b��\�\0*|\\�\�\�̏*�\�{<\Z�Uwl�Ko\0\�\�*\�s\\�A7	�qpMU�P�it�dW,�,\�C\0\�m�`\�\�\'�\�\�\�\�~�,�\�x^v���G�Ɍm.Ǟ�}��4����\��\�>\�\�&U^ny\����D\�M�4o��\���\�5\����e\\i�\�\�HC>7��,-\�Ь��~DS_cy�Otf����}9p�5u\�\��FA\�Į��P	96\�V\�g�5RJ!�\�\�q\�L,�QZY\� 1�:�\�g_��\�=i&�T�iwG���(1\�x(�K\�){�%\�cZ+\�\�}\��I~ԮWU�q\�ګ\�afK\��=:�R���ʤ�l\�`OY\�s\�cIs%\�s~��[W+#�/��\��\�_廐\�\��	\�oהY\�W�\�k�	7�N���6�-S�\�\�U��Q�\��;Ǒ�\�\�\��\��*	�\�-2\�)\���C.o\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0'),(19,'Maria','mari@gmail.com','7272727272','2025-05-25',_binary '\0�~\�*\�s\\�A7	�qp�U��1Bu�jY+�v^D\�G\�6�\\\�ȕbc�E\��ĞC%|�`_��\r���f�\�h?	/��Lk��G�\�*�\��\�X�����P�Z6-z\�\�c_[\0\�jlK/\�	~�wG4�ߙ��f\��n�\r�p�\��-\�Sh\���\��`ȧ�A�VB<\�j:���{\�\�e\�b�\"��\�\�ZB\�\�\�O\�Q�\��`\�\�4,i{힚d�fp6�֏$^�\0\��\n�\�\�&§�!�g\�lo7\�5\�n���=�;S�3Q�\�x\"5k�\Z\�\�؎\�c\Z.��\��i���5f\��Á�`��C)���eޭ}K�{Kæd�d,\�\���\'�R\�\�^� ��\�d��z�\n�Q�\�}\��\'�� P~ǔ\��&�m+t-�\�Vro\0�~\�*\�s\\�A7	�q��U��\�\0u���\���ͬ�|\�ٟ�B\rѰ�2\��}Q���<�\��|j\�w�s��%���\rMQε\�f�p\�W�\�L\��b\�꧜pS�\�\nQ�&�rZlXJ\�����\�V]q˟eo\��\n�\ZY�7�si�\�J�ы\nS|&3�$հ\�z^1v���s���Ss\�`\�*\�\�H�ٸ���\�n��\�Μ�\�0	o@������\�\�\�\� \�a�����d\�?\�\'11���oŧ�Հ�\�\�m\\5Ub�\Zy�\�b\��<k8S8|��V#��\�ے\r\r�,ޅ\�\�\��\ZD�<�(�w]���n�\�\�֨H�H�u���6�3�\�(�\�ۏw�\0����^t\�h,u$���,1Yo	�\�G�>Rd|���%o\0��\�*\�s\\�A7	�qp�U��yi�5ڳ�|>\�t�x�\�eKygκ\�\'\'/y���H��`���bYt\'Sjq�A��tb�S񀮷��L\r\��\�wޢ\�������:�\�j1!i�\�ѵ��P�c\�\�!ߵ����\�\\&\�Fѣ\��7M\�\\>\�$�e\�CJ\�\�j^f���\"z;B�\�Yx\�dO\rn�\���[��\�]	߸�.��I\�zʴG\�\'ɲff�6?؞�6��\Z.\�i�j\0\�Yq\�\�\�s2���K>��Qv��IX��\�\'~\�q{و\�0\�E\�.�(\r(P=�;�\��� ۑ\�\�\\�������A|���$�LM\�\�\��1Q2K׋���Z�\�\"��\�r��=$��7Ь�S,0�`]:C\0\��Q�q�-CpW\�v�\"\�\�\�\'Ǎo\0\�\�*\�s\\�A7	�q��U�f\�Z�}���8�\���\�f��\0gƳ�[�@��qbR?��\�K5\�\�yr�\\Q�iYwٓ5�\�}��Iy�.�=\��T`�i\�D\�K�6)�\��W+\����P�\�ݎ�\�F�G�2P6�\�Vf/!#$g1VF?<ָ��V�\�C\�\���\�U��(�	B\�\�~�\�Ύ,\�\�.7t&��e��m\�\�-/A,e���Z��G�Q�2]�6·\�\r;\�\�jR\�$�)\�\�\�KL=$\�\���a�\":�2\Z�\�\�\�ٮ|o�P�!��\�csi�9���*d�\��T�.�~	���H\�\�%ŏ\�utjVA$%�\���<�Ma��\\_\�\�֪!8�na\�\�%-\��W���\�=��]�^t\�8$�@��T��H6g�;\�\�&I_�XP\n&X�\�KU\�\�/U\�\�3o\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0'),(20,'Miguel','tuzo@gmail.com','7272727275','2025-05-26',_binary '\0�v\�*\�s\\�A7	�qpLU�\�|�;\�Y;F,\�\�ͳ�|0EOoA\�\�\�\�Ϧ\\t�,[�\�����I}��2�.Iv\�\Z���\�C\�\�?v���\�G`���%��\'\��w\�7��\�\�͇�jG�\�RV����\�\�ʋ�/�,\�\�\�e\��\�\�/j�%\��+K�9\\��	�\"u�>\r\�V�S̽�L\�(\�#C\��澥?�+B�\nU~ͯX!s\�\�SP�B��Дj\�#G��\�Ř=����{�\\H�ϱ�\�%L3$J>\�BG}\���L^ZV�5�#ub,��C{\�z\�,\�S�Υ\�\�!y�\�\�@����~\�\�h=e\�w�`Y��U,� ��\�˝h�\�O~yc�+C�B��!�Z�\�ϖ��蛥}�z�WiAS\�C�!5uo\0�m\�*\�s\\�A7	�qp�U�)]6�;%�$��p��gFRd82Zqi}��\ZZMU[!w�\�^=K�dk\�O�nmV\�\�n}5�k_x᪚wp\nޣ�\�|~�7�u��e�<H���dl�26a����\'�:3NM\�y\�Dm! �ɲ�6\\\ZSe�e\�\�\�]\�{�_\�A5I\�R_i�\'n���G�\�mZ=�\�\�1�R�1>ڮpr����\���\�\�ޓ\��y�ta��7\�V|���`I\0�Gt\�G�=�#\�\�M[iN}\�$Eo�\�9�ᇘy�P.ө�2�\�!�,l\�qpo({`�!U\�b���Ms\���\�\�`6�/\�ar\�\�\�8\0��?y��s�%���+�\���\�3�Y\��%�OY\�:\�\�tn@����BD�\�S\�\\\�\�d�o\0�g\�*\�s\\�A7	�qp�U�\��I�/C�\0\�Cv�$l3�\�-�l-�O��U�;\��[��ܯ\�k\����ߩ\�bR��ϝ�����=�\�\�u�^\�p��;̏��G\�K�\�\�1�לRt�[}*\�d�\�C�����\��YQ9\� ��$\���\�Fׯ\�\�|\�}4�n:xT�:��ܚo�/�����Kj6\�N*�R�9��R�)�tk\�\�\�	i�X?\�\�C��Vr���\n\�\�;�Z�.��i\���捻�\�\�ϰɌ۲ˎ��\�T	c�\�>\�)\�\�\�_�%\����|��\�\�l�,�_\�:/���\�\�8�\�\r��\"$@��ߜ��2\�odR�\'F6�(�mP\�еy\�\��\Z.�\��s_ph����\�\�.D�ZH\�x\�$o\0\�^\�*\�s\\�A7	�q��U��\�\�wa2�xU����r�㢗 ��\\o\0n��u-\�Z�58��La�C�/\�ԗ9p\�\�8U\�Y�tNF\�\nU)a�z���q���\�:}�\0�\�\���\�\�;\��\�\�\�u<JDj�\�Xk�\�~\� �\�\�\\�΀\\^hr�[{�\�3�e64k\��7~�T�<�/F���\�eNYZ\�L�8;\�\�o\\e�\�9�v��V\�\nِΉ\�RYr=�k�����\�0�\'zMD\�̈́ ��_j3��;}	\�\�2o\�\�m\"\�\�Z��0Zr�B��~�0Q�[o\�Z_�>��\��G�W��\�Wœ���\��d��s��@9B��\�oX�\�9\�\�\��\�\���GI \�`����\�T\�\nho\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0');
/*!40000 ALTER TABLE `clientes` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `compras`
--

DROP TABLE IF EXISTS `compras`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `compras` (
  `compra_id` int NOT NULL AUTO_INCREMENT,
  `fecha_compra` date NOT NULL,
  `descripcion_compra` varchar(255) NOT NULL,
  `monto_compra` decimal(10,2) NOT NULL,
  `proveedor_nombre` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`compra_id`),
  CONSTRAINT `compras_chk_1` CHECK ((`monto_compra` > 0))
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `compras`
--

LOCK TABLES `compras` WRITE;
/*!40000 ALTER TABLE `compras` DISABLE KEYS */;
INSERT INTO `compras` VALUES (1,'2024-06-03','Compra de mancuernas',1500.00,'SportDepot'),(2,'2024-06-04','Suplementos nutricionales',2000.00,'NutriPlus');
/*!40000 ALTER TABLE `compras` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `entrenador`
--

DROP TABLE IF EXISTS `entrenador`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `entrenador` (
  `entrenador_id` int NOT NULL AUTO_INCREMENT,
  `nombre_completo` varchar(100) NOT NULL,
  `correo_electronico` varchar(100) NOT NULL,
  `telefono_contacto` varchar(15) NOT NULL,
  `huella_dactilar` blob NOT NULL,
  PRIMARY KEY (`entrenador_id`)
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `entrenador`
--

LOCK TABLES `entrenador` WRITE;
/*!40000 ALTER TABLE `entrenador` DISABLE KEYS */;
INSERT INTO `entrenador` VALUES (1,'Miguel Torres','miguel.torres@correo.com','5553214567',_binary '\0�6\�*\�s\\�A7	�q�\�U�\�Z\�\�\�ں��҈\����}	WޘTis��Y�\��z	\���\�t����+G�\�\�e�\08xb�\�4N!\�\�t9��-{?�E�pc\�\�=�0�k�*\���`$#�\��\�_�?\�\�\�i\�+\�X��\�8E�\�6D\�	�ȦP\�\�\r���l�o~\�\�`��W�\�-\�\�̠�\��D\�\�m�	��+�w]�ή�\�m`�V��\�/���Is\�\�ɯ`\'7�\�\�N\��﷈��yc5Q\�\�f��L�VIW�\�\�pN�dIL��$��2\���\��\��`I�\Z���\�N��\�:,Ō�s��D]��|�\��o\0�?\�*\�s\\�A7	�q�\�U�\r\�)�\��ٓ��[n��\�40��NS{|��\�D\'R�)\���&\�\�\��~%\�MkdD��\�fK�0<3��I����\�C\�Q ��xJ[��\Zk%�QC(x���R�\�A}�\��Y��ÃV��M�G�J\����ZoOMɳ{^u�i�VJ�\� �:��S[�v[9\�\0攔��ͅr�޵�\rX�|eЍ�Xs�lHYj�[n\r]�\�.�AQ@/��C:�\�0��i�\rZ������\�&�2\�\��]a�SuWMv�T~\Z	�q.\����`�Zvʻ˥�r\�K\���2t\�bg[��\��ؿ�d0g�\�Oo\0�-\�*\�s\\�A7	�qp\�U��7\�>U�9�b\�q.\�V\��]~�󂘣�\�X�\�V\�N\"�F�\�	���T�_6�\0	sG*\�\�$�D:�0 ��.Zŗu\��AW2K�\��\�\�\0�d��#�\���U=\�L�@:��L��\�\�57\�!.�1\"x�\�s��N/�bCD2V_Eq�\�7���v:`��)}�\�K\�\�7\�xs�<S�u�\0�\�돻M�d�n}$�\�\��*c��\���\����L҇�e����5\����x�#���\�#iy��A\�:�k?��\�\�Kt��\���j\�=�\�̱o\�P\�q\r\�CQ2}��\�B����\'s\0\�o\0\�Q\�*\�s\\�A7	�q�\�U�פ��\�#G�\�SE6| ��ڿ��&$\�4\�%Hn��&ۡ\�����)��\��[D\�|������\�\�z/�\�֏Ѯ�d\�Xuw�[���9�j\�7��$��\r���zM\�sZFiQ\\��n�I\Z\�Db�\�y%	_��xT3�ns8\��5=.\�G�(\�\�K�:�\�W\�%\�[Ռ��_3o\�62�ޣtpD\�\���@�\�3�����k�&|`�vA\��R��д��^��~E\�\ZB8�}`�쥟�����	2jR�r�C!KV��c���\"��T�\�\0:2I�ꌃ8\�g\�f0��Ћ��S�C�(e~\�}&\�@|\�\�\���Nh7���\�\�o\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0'),(2,'Ana López','ana.lopez@correo.com','5556547890',_binary '\0��\�*\�s\\�A7	�q�\�U�\�\�\�9�@p\��E\����.\�\�w-\rHJKU��\0^%x.0vPP\�\'apؑv�ѷ=�\�\�!�\�(�yp��B�\�/\�e\���HTƵ�һT\��d��\r!h���[ej�\�1�D\�\n����\�X\�\�ڈ\�y���4|\'\�M\�,\��˴	Y��@\��p�7�S%t�?vğ��o��\�S\nD�K~��aw�\�D\���O�	\�Y\�\�_��+�wW\�2vta4�.\�%�c�ؚ��ټ -\07�(\���c�\�!��u&�\�񚔄��G��(z &#��t͐��N �\Z:\�!c����L\�\�k&gU\r��iō��b�8;Z�m3C\�-\n.+`��\�_b4(\�4\�Nua��\�z�xR��o�ml�F\�\�\'\r4M\�&W�C����o\0��\�*\�s\\�A7	�q�\�U�\�\�\�9�@p\��E\����.\�\�w-\rHJKU��\0^%x.0vPP\�\'apؑv�ѷ=�\�\�!�\�(�yp��B�\�/\�e\���HTƵ�һT\��d��\r!h���[ej�\�1�D\�\n����\�X\�\�ڈ\�y���4|\'\�M\�,\��˴	Y��@\��p�7�S%t�?vğ��o��\�S\nD�K~��aw�\�D\���O�	\�Y\�\�_��+�wW\�2vta4�.\�%�c�ؚ��ټ -\07�(\���c�\�!��u&�\�񚔄��G��(z &#��t͐��N �\Z:\�!c����L\�\�k&gU\r��iō��b�8;Z�m3C\�-\n.+`��\�_b4(\�4\�Nua��\�z�xR��o�ml�F\�\�\'\r4M\�&W�C����o\0�@\�*\�s\\�A7	�q��U�˷�x\�ޝ\�)G�K�y��F�~\�\'�cM)/\�\�\�����y|4�\�!\��u纨\�@�t\�+aՏWU}��9\��\�$i�!и��i��v[Myh����v\�Z�С�$\�iH�����\�\�\�8\�%�\�	w\\a٢�\�㜬k�\��^�\�\�m%��;�P\�4E\':ؘ&�X\�h\�ݹ�\�\�\�\�x\�k�@rNa:�\�����f,�u�ŝm�`4`\�\�a�\����M\�l;����զ	\��Mc�\Zis�\�,���\�\�\�$<�;�\�\�к\�j󤂂\"S\�1\�Jñ\0�.���\�TGv+a\ZQ\n�8�?��C\��\��X\�4o\0\�@\�*\�s\\�A7	�q��U�˷�x\�ޝ\�)G�K�y��F�~\�\'�cM)/\�\�\�����y|4�\�!\��u纨\�@�t\�+aՏWU}��9\��\�$i�!и��i��v[Myh����v\�Z�С�$\�iH�����\�\�\�8\�%�\�	w\\a٢�\�㜬k�\��^�\�\�m%��;�P\�4E\':ؘ&�X\�h\�ݹ�\�\�\�\�x\�k�@rNa:�\�����f,�u�ŝm�`4`\�\�a�\����M\�l;����զ	\��Mc�\Zis�\�,���\�\�\�$<�;�\�\�к\�j󤂂\"S\�1\�Jñ\0�.���\�TGv+a\ZQ\n�8�?��C\��\��X\�4o\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0'),(8,'Sandoval','san@gmail.com','8736666666',_binary '\0�\\\�*\�s\\�A7	�qp\�U�׭E�])	;m�a�\�<�ړ=C	w0\�\�呑$[�ȁc�����\���\�r\��\��s\'\�\�[k�J)��r(\�R�\�)�\�\���\�e\Z���Z\�tg\�`�Q��\�\nx\�\�;\�\�K�\�zia\�7q�\��\�BU��_Y\�Dl�GC\�|С\�j\�K\�\�\�C2�wR��x�\�:.A�yǭ�*7�ѷ��(=\�DP��\��\Z=pO�(�h��:z��on@�\0�:Gib�	�]=��Ը�iU*��9��SF<���J̛q0ǻ��\�m�\�ЕKjS�b\0Rj�\�0\']Z�Mw�7�o\0L�\�-}\�\����*]�!�+sپ\�+\�\�mt4(_\�N�\�)�\�~�o�����JJ4WCo\0�;\�*\�s\\�A7	�q�\�U��V�īQw\�Yǚ�wd�HN\�S\�A�U�\�1��H=S\�֢�����uz��\�W���)g\r{���7e\�\�\�7�\��\Zb\�v)L��9�r��W���&]~8�\��\�6���f/z\�5��4��<�ZY�a�s�%����a\"0�B �&q�\�\��\ZD\�G��\�\�\�[�3d��C�6C�\�~ʕF(\�S�\�\�o�\�rؑ�(��PEJ\rK� ��M\Z���*�	��]\�^\�\�\�\0�y~�/Js>wKmt\�e\��5\�\�ޒ2e<1�8���\�J����XD�o\�k���\�g��5��� \�\��q\��$�\r�e\���o\0��\0\�*\�s\\�A7	�qp\�U����\�(\��\�\��R`1%\�\�=˺��̓\�nLU\�h���W�\�\��M ݊��a�+��MW��u\�41K\�\Z\'�`�\�t\�%8 Sb\�3��\'�\�v\�Hp)\�\'bh��b�3j�Q�vs}S���ʦ\�-U-�%\�\�O\�\�V�\'�L�LTɊ7d�)\�\���\�^\��ʪ������L`Ҍ�yP矚^�\�$&a#���Qt\�y\�%\�\�L-\�pi([��\�*Jg�G�(}H�o\0\�[\�*\�s\\�A7	�q0\�U�mq��\�J�?x^��QG@DV`\r��edM�\Z\��/b���\"\�?2\�I�A�Dg\�*3ʶ\�\�UD��\��\�`A\�/�䲻�}-�\�>���!�e�S\�ZFy�V\�\�}D\�c\�\�p��\�c�� �{���9\�pr\�\�\�e_v\�s1�\�;7\"\n�L�N�Sj\n��\'P\'��\n\�y\"�v3t�$q\��%\�-f\0͛O�c\�\�\�j�*l�\�\�5�\�\��_nNp\�#��vD6�\0�|��\�4l\�ۀi�<3�\�\�\��A\'n\�\�\�\�	�E�!E\�\�w��/4\rZ`|�ߗ{;ۗ�\��\�-���֫��n{��\����\�a�43*pg\�.َ�/K\�\��p�\�m:o멸nQ\�0z�o\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0');
/*!40000 ALTER TABLE `entrenador` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `entrenador_especialidad`
--

DROP TABLE IF EXISTS `entrenador_especialidad`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `entrenador_especialidad` (
  `entrenador_id` int NOT NULL,
  `especialidad_id` int NOT NULL,
  PRIMARY KEY (`entrenador_id`,`especialidad_id`),
  KEY `especialidad_id` (`especialidad_id`),
  CONSTRAINT `entrenador_especialidad_ibfk_1` FOREIGN KEY (`entrenador_id`) REFERENCES `entrenador` (`entrenador_id`),
  CONSTRAINT `entrenador_especialidad_ibfk_2` FOREIGN KEY (`especialidad_id`) REFERENCES `especialidades` (`especialidad_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `entrenador_especialidad`
--

LOCK TABLES `entrenador_especialidad` WRITE;
/*!40000 ALTER TABLE `entrenador_especialidad` DISABLE KEYS */;
INSERT INTO `entrenador_especialidad` VALUES (2,1),(8,1),(1,2);
/*!40000 ALTER TABLE `entrenador_especialidad` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `especialidades`
--

DROP TABLE IF EXISTS `especialidades`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `especialidades` (
  `especialidad_id` int NOT NULL AUTO_INCREMENT,
  `nombre_especialidad` varchar(100) NOT NULL,
  PRIMARY KEY (`especialidad_id`),
  UNIQUE KEY `nombre_especialidad` (`nombre_especialidad`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `especialidades`
--

LOCK TABLES `especialidades` WRITE;
/*!40000 ALTER TABLE `especialidades` DISABLE KEYS */;
INSERT INTO `especialidades` VALUES (1,'Entrenamiento Funcional'),(2,'Musculación');
/*!40000 ALTER TABLE `especialidades` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `horario`
--

DROP TABLE IF EXISTS `horario`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `horario` (
  `horario_id` int NOT NULL AUTO_INCREMENT,
  `entrenador_id` int NOT NULL,
  `dia_semana` enum('Lunes','Martes','Miércoles','Jueves','Viernes','Sábado','Domingo') NOT NULL,
  `hora_inicio` time NOT NULL,
  `hora_fin` time NOT NULL,
  PRIMARY KEY (`horario_id`),
  KEY `entrenador_id` (`entrenador_id`),
  CONSTRAINT `horario_ibfk_1` FOREIGN KEY (`entrenador_id`) REFERENCES `entrenador` (`entrenador_id`) ON DELETE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `horario`
--

LOCK TABLES `horario` WRITE;
/*!40000 ALTER TABLE `horario` DISABLE KEYS */;
INSERT INTO `horario` VALUES (1,1,'Lunes','08:00:00','12:00:00'),(2,2,'Miércoles','16:00:00','20:00:00');
/*!40000 ALTER TABLE `horario` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `membresia`
--

DROP TABLE IF EXISTS `membresia`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `membresia` (
  `membresia_id` int NOT NULL AUTO_INCREMENT,
  `cliente_id` int NOT NULL,
  `tipo_membresia` varchar(50) NOT NULL,
  `fecha_inicio` date NOT NULL,
  `fecha_vencimiento` date NOT NULL,
  `estado_membresia` varchar(50) NOT NULL,
  `precio` decimal(10,2) NOT NULL,
  PRIMARY KEY (`membresia_id`),
  KEY `cliente_id` (`cliente_id`),
  CONSTRAINT `membresia_ibfk_1` FOREIGN KEY (`cliente_id`) REFERENCES `clientes` (`cliente_id`),
  CONSTRAINT `membresia_chk_1` CHECK ((`estado_membresia` in (_utf8mb4'Activo',_utf8mb4'Inactivo',_utf8mb4'Suspendido')))
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `membresia`
--

LOCK TABLES `membresia` WRITE;
/*!40000 ALTER TABLE `membresia` DISABLE KEYS */;
INSERT INTO `membresia` VALUES (1,1,'Anual','2024-06-01','2025-06-24','Activo',500.00),(2,2,'Anual','2024-06-01','2025-06-01','Activo',5000.00),(3,17,'Mensual','2025-05-24','2025-06-24','Activo',500.00),(4,19,'Anual','2025-05-25','2026-05-25','activo',5000.00),(5,20,'Mensual','2025-05-26','2025-06-26','activo',500.00);
/*!40000 ALTER TABLE `membresia` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `pagoadministrador`
--

DROP TABLE IF EXISTS `pagoadministrador`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `pagoadministrador` (
  `pago_id` int NOT NULL AUTO_INCREMENT,
  `administrador_id` int NOT NULL,
  `fecha_pago` date NOT NULL,
  `monto_pago` decimal(10,2) NOT NULL,
  `descripcion_pago` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`pago_id`),
  KEY `administrador_id` (`administrador_id`),
  CONSTRAINT `pagoadministrador_ibfk_1` FOREIGN KEY (`administrador_id`) REFERENCES `administrador` (`administrador_id`) ON DELETE CASCADE,
  CONSTRAINT `pagoadministrador_chk_1` CHECK ((`monto_pago` > 0))
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `pagoadministrador`
--

LOCK TABLES `pagoadministrador` WRITE;
/*!40000 ALTER TABLE `pagoadministrador` DISABLE KEYS */;
INSERT INTO `pagoadministrador` VALUES (1,1,'2024-06-10',10000.00,'Pago mensual'),(2,2,'2024-06-10',9500.00,'Pago mensual');
/*!40000 ALTER TABLE `pagoadministrador` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `pagoentrenador`
--

DROP TABLE IF EXISTS `pagoentrenador`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `pagoentrenador` (
  `pago_id` int NOT NULL AUTO_INCREMENT,
  `entrenador_id` int NOT NULL,
  `fecha_pago` date NOT NULL,
  `monto_pago` decimal(10,2) NOT NULL,
  `descripcion_pago` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`pago_id`),
  KEY `entrenador_id` (`entrenador_id`),
  CONSTRAINT `pagoentrenador_ibfk_1` FOREIGN KEY (`entrenador_id`) REFERENCES `entrenador` (`entrenador_id`) ON DELETE CASCADE,
  CONSTRAINT `pagoentrenador_chk_1` CHECK ((`monto_pago` > 0))
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `pagoentrenador`
--

LOCK TABLES `pagoentrenador` WRITE;
/*!40000 ALTER TABLE `pagoentrenador` DISABLE KEYS */;
INSERT INTO `pagoentrenador` VALUES (1,1,'2024-06-10',8000.00,'Pago mensual'),(2,2,'2024-06-10',8500.00,'Pago mensual');
/*!40000 ALTER TABLE `pagoentrenador` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `pagomembresia`
--

DROP TABLE IF EXISTS `pagomembresia`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `pagomembresia` (
  `pago_id` int NOT NULL AUTO_INCREMENT,
  `cliente_id` int NOT NULL,
  `membresia_id` int NOT NULL,
  `fecha_pago` date NOT NULL,
  `monto_pago` decimal(10,2) NOT NULL,
  `metodo_pago` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`pago_id`),
  KEY `cliente_id` (`cliente_id`),
  KEY `membresia_id` (`membresia_id`),
  CONSTRAINT `pagomembresia_ibfk_1` FOREIGN KEY (`cliente_id`) REFERENCES `clientes` (`cliente_id`) ON DELETE CASCADE,
  CONSTRAINT `pagomembresia_ibfk_2` FOREIGN KEY (`membresia_id`) REFERENCES `membresia` (`membresia_id`) ON DELETE CASCADE,
  CONSTRAINT `pagomembresia_chk_1` CHECK ((`monto_pago` > 0))
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `pagomembresia`
--

LOCK TABLES `pagomembresia` WRITE;
/*!40000 ALTER TABLE `pagomembresia` DISABLE KEYS */;
INSERT INTO `pagomembresia` VALUES (1,1,1,'2024-06-01',500.00,'Tarjeta'),(2,2,2,'2024-06-01',5000.00,'Efectivo'),(3,17,3,'2025-05-24',500.00,'Efectivo'),(4,19,4,'2025-05-25',5000.00,'Tarjeta'),(5,20,5,'2025-05-26',500.00,'Tarjeta');
/*!40000 ALTER TABLE `pagomembresia` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tarea_mantenimiento_administrador`
--

DROP TABLE IF EXISTS `tarea_mantenimiento_administrador`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `tarea_mantenimiento_administrador` (
  `tarea_id` int NOT NULL AUTO_INCREMENT,
  `descripcion_tarea` varchar(255) NOT NULL,
  `administrador_id` int NOT NULL,
  `estado_tarea` enum('Pendiente','En Proceso','Completada') NOT NULL DEFAULT 'Pendiente',
  `fecha_tarea` date NOT NULL,
  PRIMARY KEY (`tarea_id`),
  KEY `administrador_id` (`administrador_id`),
  CONSTRAINT `tarea_mantenimiento_administrador_ibfk_1` FOREIGN KEY (`administrador_id`) REFERENCES `administrador` (`administrador_id`) ON DELETE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tarea_mantenimiento_administrador`
--

LOCK TABLES `tarea_mantenimiento_administrador` WRITE;
/*!40000 ALTER TABLE `tarea_mantenimiento_administrador` DISABLE KEYS */;
INSERT INTO `tarea_mantenimiento_administrador` VALUES (1,'Supervisión de mantenimiento general',1,'Pendiente','2024-06-07'),(2,'Auditoría de equipos de seguridad',2,'Completada','2024-06-06');
/*!40000 ALTER TABLE `tarea_mantenimiento_administrador` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tarea_mantenimiento_entrenador`
--

DROP TABLE IF EXISTS `tarea_mantenimiento_entrenador`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `tarea_mantenimiento_entrenador` (
  `tarea_id` int NOT NULL AUTO_INCREMENT,
  `descripcion_tarea` varchar(255) NOT NULL,
  `entrenador_id` int NOT NULL,
  `estado_tarea` enum('Pendiente','En Proceso','Completada') NOT NULL DEFAULT 'Pendiente',
  `fecha_tarea` date NOT NULL,
  PRIMARY KEY (`tarea_id`),
  KEY `entrenador_id` (`entrenador_id`),
  CONSTRAINT `tarea_mantenimiento_entrenador_ibfk_1` FOREIGN KEY (`entrenador_id`) REFERENCES `entrenador` (`entrenador_id`) ON DELETE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tarea_mantenimiento_entrenador`
--

LOCK TABLES `tarea_mantenimiento_entrenador` WRITE;
/*!40000 ALTER TABLE `tarea_mantenimiento_entrenador` DISABLE KEYS */;
INSERT INTO `tarea_mantenimiento_entrenador` VALUES (1,'Revisión de bandas elásticas',1,'Pendiente','2024-06-08'),(2,'Inventario de colchonetas',2,'En Proceso','2024-06-09');
/*!40000 ALTER TABLE `tarea_mantenimiento_entrenador` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2025-05-26 19:38:00
