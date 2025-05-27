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
INSERT INTO `administrador` VALUES (1,'garrix','garrixcano7@gmail.com','9541857556',_binary '\0ø\ç\0\È*\ãs\\ÀA7	«qğ\ØU’\äx\ÕZc‹2\ìi\ã–ea|\Ìb©n[¾\";\à\Ó\ï\äğÀ[ı\ËW2Yó\Ãxó\ÊV\0¾´pX›\"\á¥ªQ¿j€	\ç{P\í\ÚÕ¯J…v·\ÉB^\0^\×\ÃVˆ\Ï\Ã\nS•¹Š©ŠQÀI$\Ñbw&:ñüıubö«ò½Ì½\É\çjX\ÆN\å·\Ê\n—!½m\ãÉ–U$¸™q\å \ë4`\Ík†\Ñõ¿3$C\Ó%\Ø\å}W\Ë…\î¬{o<¼iWe\ÓJüƒ\Ä÷¥\í*«»‡üB\Ø\ì9\Z:—˜>H	\ço\×w#Œ\Zn.Yo\0ø\í\0\È*\ãs\\ÀA7	«q°\ÚU’Ï‚\Ôõğf(\ì46ù^»	\İC‚\Ş\åÜ¸y—f\Ã\è\Ís’\Í\Í\"\Ğ`³Ğ‡&¸\ÑI#‹|K<\"÷Å»^\'\'\Ís÷l]A$û\Ñ¤\ÄvvÈ­\ni\Åu\ÈOŠÁ\\e\é9+Y0b0|ÿ\Å~¦?£*‘.ÇŸ\å*\â‰F`ıÍ§¿“Î¨¹¯o\ã‚ö–ê©“\ÊN\×\é\ì|\Í?|?,Y±\ĞS\r–AK\å,k»3ak\ã»@ \Ú\à¡I½h_À(­’\\Õ¬$:\Ñé‘¾Ìº§I#\Õ\Z ¤B¬OS\á\Ñ\r\Î\Ö8\è$½.r\æx\Åo\0ø\ã\0\È*\ãs\\ÀA7	«qp\ÛU’%×`útÇ\rj%“b-L\ÌZ\Ã(œa yZ…±szgeú\Z¾RùÀË‡õ\ÅÔ…TƒªÕ·cvF$¶¦\éß§—Ay›\r¯\Ş-J$\Ú\Âx|9Ofj–Š>\Û2?ƒ–ÖŒ¦¹NOÓ}aÿ¤8£‰u—0Å­5H\"W\'ûu«\ë\Z?/\ïbö:c J¢!%­nM2=¬`D@B-x.VŸ’e,ş3E~ÿ@Yas¡K¸\á¾\îAø\ÜÄ¹™\Î\ã¥.\Æ]7¾\Ù\Ì\ZA¤w˜o\0\èú\0\È*\ãs\\ÀA7	«qp\ŞU’«£\İî¤ ”:«A[úmE\'A½¹Œ.:\n=™p\Ñ\Ó.F\Õa\Ğ\êef´–¹3se\ìùŠ\ã7g®TXõ!VÑŒ¾·¼­»¹\Èy¥±\Ç\rn¤Ë2Ï¯\èğU’şm5—QŠM;\ÇOpı\ÉTË“)>\Çhù4C:—ù¼	ı?n_b|\Ñ}–01©\Åköö\Õ\×~!/o\È\é\èÁ\È!\ä;\×º.:doG\'J’‡\Ñ¶šSXº§¾}–BD&G\Æjl·Caj\àD\ØÕ•Mø\ÖFÌŒ‰ ¹¼Û™İµIaq/ˆ¾°•T\â<\êô›•VMyo\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0','admin'),(2,'Jose','luis.herrera@admin.com','5553334455',_binary '\0ø~\È*\ãs\\ÀA7	«qğ²U’—C»|}\Ñ7°ô],G\ØòºYğ®¬ECù¤N˜GÀNñ\0¶ñ\á~ 2\ÚUŸw\Û‚4}\É	ûX	\Zªm=\âlÁŒğÀnš\í”Á^%Ê‘Á\ËZ\Ã\á*pşûµ’LMù\ÔcöpEZ9™\Û5\Ò˜˜êŒ»\×\"¨ø\Õ5iµp\ì$zlVs_\ê\Õ?‘.\Ë•»\Æ-<Œ\ÓD\ìÏ¶S•\ÏA9¨¤ó š#\âó÷¢ğ\êŸ,<ñkc°)ƒ¯zg)d\É›\Í0ª\rÚ¿òÙ‹”4˜‚f0bp ùFGš,tó»\ÅA?\Î{õd×¨(C\Ê*xuú *È²«2|gVjœ0\0\È\"Í«µS\Õ/¨2¯B´C$q\Ëx²ù_V\Şıv½ªİ®ò\Ç\Æl\ÄQ\rAm«iU»\ä\Ï\r–—V†\Ê\n4gÊƒ<uL3Fø0i‹G,T\âùœsÿp\n¨]\00R3Ñª@(\Ú>\èŞªœ\ßÜ³#E\Õo\0ø\È*\ãs\\ÀA7	«qp³U’\é\rø\Îp°|<:¦Ìš¡Y&h\äøùb-™¦y`„2\Í}Ò‰ó¼\îC£\ì(x>b4¸L`”I˜\Ï-™L³r$#5x÷…“ÿŸ¤\Í¡3\Ü/‰w9\ØjS\ê\Şÿ©;r\âu¸Ib‚^-‹tYNòšı””\Ë\Ê\0¶Yj‡D\ßóWkm@¯£a\î\Ù:/ˆ\Ãj•\ã\Ç%³a]B²œ…\n\"\Â\ÙA0‹®r÷\Â*ƒ†>)d`ú\ï#™\Ø@‘	¾tIv\Ì\ß]Ip\ê\Âş\ì³\Z\r_+õ3C\ê\í\Æs÷x\ç`õŒµD»‹\×É–F+\r¨Å¨\çŸ3\0}v•\Ò$ıW]Û†\ìRj ‘¸Z³¢¨\å¶™nC‹•¦;nK·˜T6/\Éù,–\áN\ÖZow_u\ï\ç.#£j¬†_ù\ÊN\ï\Ö<M8Œ{6‡’kˆ\ÉÉ­sPµÄ‚P·ú¨7h–­\Ñ\î:\'9ACşT÷)_0šZ­o\0ø\È*\ãs\\ÀA7	«q0¶U’ f9\ã.Ibıc\Ìùcg?²n\Ğ\Ğ=ğ¼çŒ›¥,\êÁ8O:«Kkˆ’b\r´)\Å0#$®\Ê9¾W‚\×\ã\Ôü\\”\Şö½Ê‡‚K)À®ıo~p2<¾±\íøY	7\İ\ê¼WĞ—şoëª½‹\æ\è62ú\ÖuL#%˜¾Á,\âA€\Û	\Ò\ÓB;×‹!º\á82cõ¢§6œ®\ÏtTÀóÿ;ÿñ&%où=0j&\áYb\âO8TÖ«sŒ\Ä\Ê\í­d\İ4	Œ¶)‘\nÄ“ş·.ƒSø;\Ö­†w¡¼\Ã\ÖÕŒ\"\ÔA¾©‡Òµùk³\ï¾‹\ä9?üAıv¹C\î\Û|€ƒD¶\Â‚>o\à\ã-\ïQ­øŸ\İY\ê\×@ra\ëk\Ë]\×}xc\rÿ\\º\Zf\0‘P‰ub™\\ôf.öÅ«…\Ø@\r6ñUOµºC?\n\íH†G“{9\î¯\àr;…j•Fe…\ì?.»ôœ\Ôo\'x.Å£ó?¿o\0\è\È*\ãs\\ÀA7	«qpMU’/³uŠjiBoƒva\Ù\Ü-\î-\Ã\"ÍŒ7b\'\ÅeúV…ºLE\ĞÌ€i§\á_\0%\Z\'\\‰?rğ–©‰\Æ(Ÿ\Õz8š—¹û\æ.	m½!~®\Ö\Â~;÷ß¹30„H\İ\æ\É\ç\È/¦½\ÒP=q€œ\âaPV\ß	c©\Âi‰”D2\×È­\ì,%\Øÿ\Ö\ÎŠ\ësJs>6ğ€Q_¶—¶´·£Å¾5· K2¡mªšgs=E‘0„—Æ´m\åÁ9;\Şq]¯Œ\0gbH…c‡C@…\ÊA -?\âc§\ÒzS\ÂúMfPúŠË”‡{£\â\ë¬•\Ú\İ\'Š\ÎoAHt\ÖY\İ¡`p®Ï³6\Ş§7x\Ä6Î¬2Á\Ô\Î\Ëx\'$d\'¯\Éıœ\ÃnmJı\×Z°BDküMÿ‘;\0=ˆşfø\Ê\É¿“\ŞFÔ‚V\ĞAjó…A±?S&,$\ê²\Ó\å$\n­~„f}bp{»…­	ú¨ş·\àú~\ã_°\ç¤ıÿo\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0','2701'),(5,'miguel','gatitahot@gmail.com','9293949495',_binary '\0øs\È*\ãs\\ÀA7	«q°¨U’<€9û°ùq‚\ï\'”ó\ëŒj*\à¡Ù£5“\ê\rÁWı™ÿ\'ø\ÌkÄ±DKvR¯µ‚R\Z§#VDNlµ<?^Š\ÊH\r.&œ›û\àe+OøWd?,*Ç“‡|ú°sŒõL~T;\âı\ã@XL‹£lñ‡3C¦´\Ù	–My`47\çú\ï‚KÎ•ØŒ‘+¼ğ«¿M\Ó{\ã¸zd¹ôx6ÛN~\Ñn—óÏ¦.\Ò@œÙ\Ót.>¯\â\Ëo—Y\ä* ûwA·¤,ö‰W\Ã\â$F\Û\î³=#ã¾ˆ°	>\ï\Ô?ºbòE\Ü·a¼\Ú|t\Î\Îÿ\ÍôE@öZ§$·XÀDK°†\á\Zœ\å„¿»x6-z\è¦\ã¼)“üÓ£½ }|¿]§”ùü¯\á\Ò*»\î 4Z/{¿\Ç\ÕQƒğÑ¼S\ï&-¿\ĞZ\n=İŠuMp£:@ò¿ş\î0+#ó!ù>ù\êo\0øA\È*\ãs\\ÀA7	«q0­U’6ˆ\íèŒ“ƒğös7×¦\ÄLƒ\0\ê\áÒ¶:ş\Êö7„\Ò.Ÿ/®Áö‹cj¯l\àÿD¢\Ón7i6L£j›\İk…\ç\ÇÓ’\æ#¢\é\çŒ\ì\'^d¯dgC‚Jÿˆ“¬v–IÓªyWDhvÒ°¤;oZ¸Œ8S›WfÓ™S„”v\ŞFŒ\ÃÈ¶x…`N}‹\ëj	D\\\Æy¯‹w`»\Ü>¾G\ÆkU£‚©©!ÇŒ h+ZIjBUƒI8„z½\íÛ’\ÕÛŠŠK\ßûke]÷@?¯¦\Ëñ\×º?\át:ş¶µ)Œ–ñÖ©‡û£˜ÿ­ª5_²p­\ÑÀ:\â\r\Ú\è2\0\ë3L—»y®\İ\çS4¿\Ãÿoª‚\Ë\Ö²`q\æo\0ø:\È*\ãs\\ÀA7	«q0‰U’˜«[ô®Vl/,ø8s0öÀE™˜³¤´W\n\ê/ş|\ĞJ[0^\0y õ§0ú=d¼j\Ø\Ğ	—\ÂÊ…ùM\ì\Ó3ô\Ëq\ÈX÷[u´cM\ÉLG®?\å}÷ù\Ø>¾wgòÈ¡ô\ÜxHj¦0©7œ\ãô\æ\ÜÔ‰1Ûµ\à\Æ§e\æ\Ö\äªWò@Iˆ\Ø\İ\n~+˜¥¯EJ\î‘Sbÿ¡µz\\a$6{J‚\âš\Å‡\\Jº4«\áL\n\æø\\XGƒGj—=ı“vğ°Øº„Kº\ÃR¢¼*¨±l\'\âøƒpŠmU\Ú\éV&K\ÔZ%\åò¥{KÖ‘ğ!!’&\"®i€ õ©%ü\r\à>™„®oŒ\ß8\Û(*%¨µ?™‰|®1Urt#Á ¾Pò\ïo\0\è1\È*\ãs\\ÀA7	«qğU’›\ã\äi8Šš]\Ï\ê\Z\Ç×‡H”£+\éŒ\Ñ5K\Û\Ş~x\é\ÄXŸ‘¬|µmÚ¦c\ÙzÁ	…&a¥\æLøÀ\ÏE%!W\í£R>\ÃÈ¨S°\ìğkY\ÎÆ‡J–ˆ\Ä2€\Ê\ç\Í}Rd{‚\ÃyMª*²\È\Ãa’rf\ÜquJ Šş¼jI8—\Ğa\ÆT’¿t}0³\ß\'\äJ»ÇŒ\ÜW*•6Ldb²³°v\ŞQü~¹\ãûimß¦ §\Ò0&“7\é1^%ZA\Ø-–º…a¤­\Ù…£¼\Ş\Æ(OÁÿUE!\Ù\î£j\îŸ\åzDd\ØLÆ•d%ehók’\î\à$+½4	\â\èT&)ò2]i¢\n@\\\ŞS–²F~\ÍÿF¬4\äş3\"O}œ}o\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0','1234');
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
INSERT INTO `clientes` VALUES (1,'Osmar GonzÃ¡lez','osmar.gonza@gmail.com','5551234567','2024-06-01',_binary '\0ø\È*\ãs\\ÀA7	«qğ\×U’IÕ—z™1‚\Ó#\É\Õ\åù\ç\Ôdµ‚M\Ş74V|¨1â¾Š»œù¶\É/hµ\ïø-ó\Ì2Ë¥˜ó=”w\Ğh;g\Ş\æ\0g\Ğ/\ï\ã“\nt¥U\r™H&…pšR\à\Òó„ğ7%C™—›hbø\Ş~\â\Î3S´\Z\Ş\Ù+n“\áyq1 …\É8\Ü8™gl\ê\Ó4lóÄ‰fJx|]T±¸h˜\Ä\Ìx\å³\Ş,ú\İxv\â\İ#\"Z!«^K\è|I£ÿœ “\ìu÷-siºEóñ1-WQ@«\ĞúVv\Û}r%‚\Ó\ÔòP\ã4É˜²\è\à9\È¦xpE*E\Ø\ŞÛ*-]ˆ{\ÑDN\äey×ˆ‘\Üb5o\0øù\0\È*\ãs\\ÀA7	«q0\ßU’È®ÀE[†R\Ïxxµce\åı“\á5f\ËvûŠ¨œnô ŞƒoÀ÷ˆ¿bY\æ\çh)ûS\Å\å@\ï\Í\å ?>\Ú-r>m\éj<)\Ê2ÀŠmğw«	>‚öá§¨¾iv¨! kš1d\ìd\ÙX‘gô›5\ÈÎµ´\ï)®¶P@À¦-„ü\Êı„\Z*/m¸;N\ç6qn°L\"^:Áµ”øM\" fl[\È<\Ï%¶ Â°\Ñò®` \ín\rj\ÈPW‡\Ñö.‹»¾\èq\îı\ÌûØ—£\Í¡pÂd¯¡&”ı\Âg‘&º.P‰Š&²´ƒ¹Ù––s£iueo\0ø<\È*\ãs\\ÀA7	«qğ\æU’„6 0\'R\Ö\ê»\ZPó3He\ÏOÁ\ç\Ø	j0& ô™%w€±£«‚gp,vè—°²\ëõm\\C†L\àC|Œ{e7S\riz-°U\Ì4Fó¸³ˆ„iğiN¨˜)\ça¦Íˆª¦\ìM\0I¯~\0:‹—x—\Æ\é\èr$Ys0¦\à\'\\\èm\İ\ïùSVz\ÄŞ•ÔŒuûº&8óø‚fk%¹RqŸÜ¦mz³b=!óğ\Ô>aˆcŸ\Ç\0›Cü¢7IbFi3m6œ²\ë‚\Çô¸O¯>´q³%.q¨r]PÛ”{ı*ñ!\Şú.4h\"\ìoÛ•0ô\Ó\ÕhzS\í„\Ïrz7!U\Åú~•™@ˆL…†,º\ç&¿-z0‘¾’ƒ{~ÀoÖƒ™Ša\Ì0D¬•T‘\ĞW\×…6Ko\0\èõ\0\È*\ãs\\ÀA7	«qğ\íU’Ø¥gz\Å?\ëŞ‰nvØ€8À\Â3‡@Ï´€»^FPÏ–‹R”\":˜!kcBƒ©LK\ícmóFej\Ìõƒ´•p.Ç”û@\n?\Ş\×K;Š?Fg<úp”¬1®¡3]÷\Ï mrd6!óÂ‹\í£Ì®÷œ˜^a©:.[\âs\Z\ÒRø\İ.€À§“ƒhddúû\ÖİŠº_q/§\n\æşZ‹aO¨Ì‰\r˜\à\Ş=\çˆZ4\ä?Ö«ıD\Ü\ÜZ„4ƒ©Lú¤9 £qr»c‰\Ø\ç#¬XQ#f\Í \Ñ\Ûö\â\ĞG½z>2F¨\Û\ÇÈ¶\ÈOo\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0'),(2,'Carlos Cano','carlos.can@hotmail.com','5559876543','2024-06-02',_binary '\0øQ\È*\ãs\\ÀA7	«qğ\ìU’}\Ñ\ËHr¦-u,,‘_\ÏyiMn\Ùö«\îW\Ğ÷5À\Å\Ö\×	\Ü\Åú\æx­\Ñ\ìO \Æa¯RÁ…\ìòM,ˆƒ\"”!u\ÈO—y¥`Ÿ\Í\0ôÅŸ<…NNQ°\n¥\à‘{a	¸›>0±ˆ\ê\\S\Ä2)¨²\Æôo¸;:y­\Ğü¯R);³È¼q)—\Z˜o\Å\ê\Ç\È(IB\ç\ÅQ\âöJD|©&56\ÏÆ·QµØ°›L¥¸MvSü¶ŠC7>œ`¯‰–Õ›µN†\í5\Âûyk>\Ò\Ô\ÉYŒ\èô°\"\Õ\'\İlôò3‰T\ÈA»Ã•ôj·;-\Ãk\É +«e¨\\’C¸Á˜¨U‡{K\Ìô4\Ú\×öK8·‘\ZP£»°£ºU±³b©×œg–qi;\ìlú‹<(\Ş\éÃ¥ ö`ûu)È•Q;7Ò‚r–„\ÖAœ\Äo\0øQ\È*\ãs\\ÀA7	«qğ\ìU’}\Ñ\ËHr¦-u,,‘_\ÏyiMn\Ùö«\îW\Ğ÷5À\Å\Ö\×	\Ü\Åú\æx­\Ñ\ìO \Æa¯RÁ…\ìòM,ˆƒ\"”!u\ÈO—y¥`Ÿ\Í\0ôÅŸ<…NNQ°\n¥\à‘{a	¸›>0±ˆ\ê\\S\Ä2)¨²\Æôo¸;:y­\Ğü¯R);³È¼q)—\Z˜o\Å\ê\Ç\È(IB\ç\ÅQ\âöJD|©&56\ÏÆ·QµØ°›L¥¸MvSü¶ŠC7>œ`¯‰–Õ›µN†\í5\Âûyk>\Ò\Ô\ÉYŒ\èô°\"\Õ\'\İlôò3‰T\ÈA»Ã•ôj·;-\Ãk\É +«e¨\\’C¸Á˜¨U‡{K\Ìô4\Ú\×öK8·‘\ZP£»°£ºU±³b©×œg–qi;\ìlú‹<(\Ş\éÃ¥ ö`ûu)È•Q;7Ò‚r–„\ÖAœ\Äo\0øL\È*\ãs\\ÀA7	«qğ\îU’aù\Ûø\Ú@Uƒm.›Vf—	FI \Öß¥¦ú‹9Q¾jŠ•Œ\í\ä|ˆ×™\ä\ÆC\ÄQ>{\r}\Ø+øB¨d.\ê˜õF‡¾¼ı=Ô¸Üºò_ÿ\rVdû@t²8š\æ\â\ì`?\Ê\ë¯5\İıL8\ìm\îS`ŠŒ-ñ}\'N\â—Š\\ôe\ë°Dr¦=\Ğ\í\\ü­M¹y\Ô.£4[µ$Úˆ-\ËC\í¦ºŠH\"¾ã¬¿C	×•^\Ú\Ë\è#p\ë™_;wƒ\äÌ¾£#\×<c’\n:\Ï_¨ˆ\äş£Gñ(Y÷Uj©ib\Ç/WÑªƒg†Ã¦–üQ†E…cU\ÏşºX÷¼¸\é\'|VUl4¨V;}¯%‹”ÿ\à¹(}\'¡›œ\×®û9\ãAÎ‘\ÓRK\'\è¿N§hg4YO?F‹a\ëÛ€\Ê\Zo\0\èL\È*\ãs\\ÀA7	«qğ\îU’aù\Ûø\Ú@Uƒm.›Vf—	FI \Öß¥¦ú‹9Q¾jŠ•Œ\í\ä|ˆ×™\ä\ÆC\ÄQ>{\r}\Ø+øB¨d.\ê˜õF‡¾¼ı=Ô¸Üºò_ÿ\rVdû@t²8š\æ\â\ì`?\Ê\ë¯5\İıL8\ìm\îS`ŠŒ-ñ}\'N\â—Š\\ôe\ë°Dr¦=\Ğ\í\\ü­M¹y\Ô.£4[µ$Úˆ-\ËC\í¦ºŠH\"¾ã¬¿C	×•^\Ú\Ë\è#p\ë™_;wƒ\äÌ¾£#\×<c’\n:\Ï_¨ˆ\äş£Gñ(Y÷Uj©ib\Ç/WÑªƒg†Ã¦–üQ†E…cU\ÏşºX÷¼¸\é\'|VUl4¨V;}¯%‹”ÿ\à¹(}\'¡›œ\×®û9\ãAÎ‘\ÓRK\'\è¿N§hg4YO?F‹a\ëÛ€\Ê\Zo\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0'),(17,'Susana','sus@gmail.com','8273636363','2025-05-24',_binary '\0ø\È*\ãs\\ÀA7	«q°†U’\Ô\ç\×75\âh9\ÓmEû\0\È\ÆD\Ôv\Â>jA!]\\^	„é”_mú;¥\èdb\0A¿½‰uwu\Ì\Ä\r$£dÃ v?öFD£d‹\Ôó­«ş\ã‚øh­#D2\á\Ëó\Ãh¦¯€¦m\ÖÁW»`)\ã€eSXZ„û\å 9\Ñd|3Q…\Ï\Ì=]QM\é\Ğb2U\ïC´ºÀ“(˜ø™bŒ€úš°•üºS\è¾V?,\'V\Ìv•=\Ú[uªF«ïÇˆ{8•Jd¿I_\Ô)·\ÆY#¡»©ºj·K3\Ñ\nr\rıu²şf—\\Î§T\çV\ì0º©”H_Z\élX\×m\í\á‚)\æwEª÷\ÊV]kº©®’uÆŒ4\Üe\İ\ì9÷•\Ö\Æ\r6ú\ëM\ä&^‰É¬u!\ãx_g\Û&¸\'˜/D€ä¥ªõ\0pÀ¡\ÃvU\ç\ï#U;\ÖwÒ\İBSÿ³}MR ’R¹\Æa‰šë™¾Œø\ëD\Óı®wqWKµ‚L¦\Éo\0ø€\È*\ãs\\ÀA7	«q0˜U’%ŒB[°ó&¿ú\Ô\æõö\Â8NkF9UV¼¨‰¿J˜ß¯\'\'OE\Î>÷$»\ï\ë´ÁJK”³> *±ßŒª“h‡/•`¥\êò\ÅFË‡\æ…D›\Èw\Öağe8uHùÀª\r`\îxº{s…\àz.]½Vƒ™z\í.L\ÚdXk}W\æ	À\ì4ğ=cS\"ÿRğ½º\îRú)ÜˆB«r¨\äeD³!I9‹_>õo\ïŠAº1\Z\èP)ƒhV£]p[\ÏE{Ó\åˆt7˜¡^i†øE†\\õ]\Â×‰E“,\êª;\ÚA.´8\Î0\Ù\ÊÀd¾º*»\Ô)Ñ³Y¡\0H?±aBHƒ]ù\\³†Ó€¢\ÚÃ ñ\Û\Éi«Á¢\ì™\î)^x\İ\î]ÀK\ì¦Ì²\àG\éX\Ç\åJ°\Ï? $Y‘ˆ6“P*\å\Â`$)T‹‰ ô:\Öôš3«¿A2\ÎIG9%ã³\Ïf,Á´»\ßV¥ğ\n`X o+ı\Ş8k§•c;µ·o\0ø\È*\ãs\\ÀA7	«qpƒU’¡Fô\r@\Ô\ç±ùW¸n¹pÜŸrb]¸U«“&%=2£•ZK§löÇ–:FuYŞª\ï«0>\ŞE ù§›Q÷Ÿ…›Ÿ”‰1 z-~,\ã\Øù\ì—\Ïöû´ˆ7\0D²lWú8cºOÎ´y-~\"•8\Ò ­@+SÊ¿´_É£ø\à<Lİ²û\Åé³†ğTJ¾\äAÅ”y¶.ˆš\Ğ3\İM\ÕO«cŠöü\\$úş·GWo›# ll«Lù\æ\ïÿ\Õ\í\Ë\ï\r÷\";\ÍGò\Zp°–\ßC\îaN\ë™J\Ùaˆy5P\ç9HlY\Ùù/E·V\Ûú\×\n%0òE»ö\ã8”YP\ë£>?1\ÉK*Ë³\Ø	•:!WL‹›Fñ\×F\ÜN\Õú˜*ÒŸ\í*#rjV+N~¼XX#¨˜¡†T¥\Âg|ºj.mICÁP¬	{œ%€\ßY`£‚_+O\Óİ­ö ª[lµ-‘øª‰› Y\r\Ğmo¿\Æ\ÖW®~o\0\è\È*\ãs\\ÀA7	«qp¯U’O+Àõ¢\Ûy\é\Ñ\Ë\ÕUª_¿Æ‰IP§\\µy¹y¦P;6\Ø?­I…B+»½€V;Rİ±\Ü°÷«aó\ÂÁ¨]\Î\İ%…>‹ù\Éz\èuty‹…³\ÈM\ã£\çY½Òƒ\á4­*`\ßt@m„Ç³Œu²hv’^\Ç R$÷`E{’2{EÌ¦\â­hGLc[«˜\Ì\îğ\ÄFÁeV‡{ä¹=ˆ°\ÈV«ü\å¼wlüÀ\Í%\åœC3\Ë\ŞQ«+|w\Ê&c*\é`o‹ñ\Ì‹•”‡‰\nöÿš%iRK¼ëª•‰¤Æ—¾BG)¹{<¯¶\ê+ö,ıE@\Î4{\Î\Ğ_±ñ‘¿øÀ˜{œs,X/b\Ûü\nxª\ç†%ÍˆyP\çµhXJCû\âaoxw\'g?^>°F:”\Ù\ßiı¾\ä¹Œúb:-ÁØ\İÌ3À\Ğ0\İ*…]7\Ü\Ë\ÛÕ¨¿¯DEÿ¾†…m=<\Z\Ì,ö0Æ­WJto\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0'),(18,'Candida','can@gmail.com','8888888888','2025-05-24',_binary '\0ø\È*\ãs\\ÀA7	«qğ”U’e…n\Ê}8\"ñ<¼\ãc„zq8\çV¾Kô9‡‰<¼\Ô÷ª]\ílš B\á\n§\Ìp|?Î°SQ\é<\àJ·~N!Tsù\Ì}\ÓÍ¤¸@šú(Q\áT\â¼Ø¸¹¹6£\È\İ`¶\Ç\'Xi©¬+p\Ã\ä\ç\È^A/\ïRÎ’6Mr\ÈÀI!|ƒ£\Ïy\Æ\Û@\Ê\ç¹\íu\\M\ãyN¯=Xş¯\è+\Ó\×\è`Y\Ë=¡y+­\ËL\ĞwN\Ö\Zü7:\ÖN¾\ìi…{¶ô¿µs^B\r7`¹ÿCz\áù\ç¸\'m?—c\×i\ĞŞ·\"L½l\È\ÕˆÀ%«@o\Û ³Ü˜\ã\Ä\Û\Ø×®X\à)–\ã”CE\äs¦V\Õ—ò=8q\ÓF¬‹û\Å\êiÕ¤U2§\Ãd,\ĞdJ\Ë[Í$@>E<¢\ĞË‡M\Z‹Môpd*o´|yœ]Æ‰ûGµ—F\ãnyZı\çŸe\\Nµü\âğÇ\ÒO~ho\0ø\È*\ãs\\ÀA7	«qp©U’h\"Ø¼ \Ä\ïH$,üô<A=ğleY\rˆxœ…\Õ\ë.IF\ÏÈ£„è¦°\è@_õñ%\åù\Û\nrDƒ¨bt³Rz\Ãv\Ö\Èÿ\ÜZ—­13¨°õ[\ÃzŠ½Z00õ\É¤Qñ\×OPH5“Hº\Û\æ60\Ö\Ès \'E®lbx&qIo<&J\ànó….D”m¾(ë’°\'2‹\0\ÆGhŸ\ï¬T „¥×°3N`\â8M/\Z½Æ‰!l^Á†\ã\Û\î\Ë-búG\íqx\Ãm¢t©™\ËbÙ‡l\Ğğ\ï 4š®´¾m-\Åş%)\İS¥¡)-¾ƒd3\Ã\è\Öj* ² \ãX6ÿñõøá¤¾Öµ§võ	_ªş\á;\ÂÕyu±p\Ïa¥vkı\\À\ì?O\ÖJ­Å°\Z©<=p\×9(h\Ì\ÅÍª:¥V¢&4GwŠ\\\èdUU\è\ï„X”c¨Q\ìÒˆ\âÌ­ø:v-u²üš«û\Ş\æ\æz_\npU4\ÛZ3´<\0¼}Qo\0ø~\È*\ãs\\ÀA7	«qp‰U’\É\î\r¥ÑŠÀÄ‡\Øğ¡«ğ€brKölú6g²\ä?¿|QE_‘óõ[H¥ú%½?§¿\Ğü50+\Æ;à®»\ÄA\Ì\\\í*ğ\ç\rŒµv\â—u¥<ôj“yZ%ÆË‹¦Ö­¥¤\\a:ó=²J“ß—Jd\"}~ğùi¶é¢ˆ­Dhÿ\ìw\\H®ÿô’@A¹‰\Ø·&•\Ë!u@B\éVQô/\Ã\İ^h“TN\ÒÁ~…\ÔÁ¥\Ø	\å«-v›2Ài,sw\Ú\Æ8d¨Ÿ¸¿\ÏpôA\Üa‚X1X±UYNºó½~\éR¢ºòRŠ^\Æ\áŠ,y¼:\É\\`\â÷	IÀûdŸ£NV_¼h]g€¦\îı.Œ¤\é\åß7ÁE]Iù\äEs)yğK\Ó\r\èi°Ï»¬^S‚\Ö{¤ı±\Ş(š\Øk6\Ã_>mzK1(/[S°jı‰*ı\Ó0\Ée“¦À{p\Ñ@#Û‚?¸&\Ñ\çbºµ\Ì\0*|\\¤\æ\ãÌ*­\é{<\Z†Uwl­Ko\0\è\È*\ãs\\ÀA7	«qpMU’P¦itüdW,ó†,\ØC\0\Úm`\ç–\ê\'³\Æ\î\Ö\é~¹,Š\êx^v“‘G§ÉŒm.Ç°}ù½4Á’÷†\Üú\à¯>\â\æ&U^ny\ãø¥·D\ÑM°4oğû\ã‚õ\Ú5\ãÿ½”e\\i‰\Ò\ÅHC>7‹°,-\ÙĞ¬´¢~DS_cy÷Otf‰˜ø }9p‡5u\Û\æûFA\ÓÄ®’œP	96\ãV\çg·5RJ!÷\Æ\Ìq\ÛL,QZY\İ 1½:»\îg_û£\ãª=i&¯TiwGµ¡÷(1\èx(©K\ã){¶%\ØcZ+\Ò\à}\ÊõI~Ô®WUƒq\ÃÚ«\æafK\ë°œ=:¥R¡¼½Ê¤øl\Ş`OY\Ïs\ÅcIs%\Øs~ÿ’[W+#½/¾\Íù\Î_å»\á\ìñš	\Ìo×”Y\ÓWÁ\Êkú	7½Nó­†–©6›-S¿\Ï\ÇU¶—Q­\ã¯;Ç‘ÿ\Ö\×\ä›\Ñ¯*	²\í¥-2\æ)\ÔÁ½C.o\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0'),(19,'Maria','mari@gmail.com','7272727272','2025-05-25',_binary '\0ø~\È*\ãs\\ÀA7	«qpõU’¨1BuøjY+†v^D\ÇG\ì6\\\ë®È•bc“E\äˆÿÄC%|‚`_¿”\r‡¾¢f±\Öh?	/³üLk±ñG’\ß*ö\í¿ô\ÆX¬­£ƒğPüZ6-z\Å\Ôc_[\0\ÍjlK/\Ù	~†wG4öß™Œğf\Í“n÷\r·p¦\ìñ³-\ÕSh\Ë´¾\ãö`È§¢AVB<\×j:ôµ•{\ç‘\Óe\Éb\"Š¼\Ö\ÂZB\â„\Ú\ËO\éQ•\ÑÀ`\á\Å4,i{íšdÁfp6¦Ö$^¤\0\Ãö\n\Ó\Ó&Â§!Ág\ç²lo7\Ë5\çn£¦=ş;Sñ3Qš\Ãx\"5k—\Z\ê\ÉØ\çc\Z.·ú\áşiú”ø5f\Üó—Ã¨`Ÿ½C)°ÿ½eŞ­}KóŸ{KÃ¦d‹d,\Î\ßò‹§\'ùR\à\×^¾ €‚\Úd†•z“\nøQˆ\Ë}\ëô\'·  P~Ç”\İ&œm+t-³\ãVro\0ø~\È*\ãs\\ÀA7	«qğ†U’–\à\0uù÷Œ\ĞşÍ¬”|\ãÙŸ…B\rÑ°˜2\Ï¯}Qğ¾ı¦<\Ä¿|j\Ïwó¸“sı¤%úŸƒ\rMQÎµ\î¹f¶p\çWƒ\ÚL\Úùb\áê§œpS—\ç\nQ…&ûrZlXJ\È¡‘¢†\ÔV]qËŸeo\áğ\nú\ZY©7øsi¼\ÃJªÑ‹\nS|&3…$Õ°\Óz^1v®®s€‘ÿSs\Ë`\à*\ê\ë H´Ù¸º–\Ïn©©\ÑÎœ»\Ç0	o@“¦¾şğ\È\á\à©\Ï \Ìa†¤¡Œd\Î?\Ô\'11ö–ğoÅ§¼Õ€¶\Ñ\Øm\\5Ubª\Zy\Øb\Ë†<k8S8|‹‚V#²­\ÍÛ’\r\rı,Ş…\Ü\Ş\æ¢\ZD¾<Š(›w]˜£¯nŸ\Ô\ÔÖ¨H¶Hôuğ‘6€3û\Í(û\ÒÛw‰\0¼Œºö^t\Æh,u$™¹ñ,1Yo	\ÖG¡>Rd|¼€·%o\0ø€\È*\ãs\\ÀA7	«qpU’¢yi 5Ú³´|>\Ñtôxÿ\ŞeKygÎº\â´\'\'/y ¾óH³“`ıº‰bYt\'Sjq–A©î¶¤™tbõSñ€®·‰•L\r\âõ\ÍwŞ¢\Û§ƒ•–š÷:š\éj1!iÀ\ÔÑµ¦µPc\Í\Ì!ßµ•ü³\Ù\\&\ÏFÑ£\Ùû7M\å\\>\Æ$©e\ëºCJ\Å\äj^f‰·ş\"z;Bµ\ËYx\ËdO\rn\é‰ô¿[²º\Ê]	ß¸¬.¸­I\ÑzÊ´G\Ê\'É²ffš6?Ø‚6ö³\Z.\Ëi°j\0\ÃYq\Å\à\ãs2‡˜¿K>˜úQvõŸIX­¸\Æ\'~\á˜q{Ùˆ\Ó0\àE\Ğ.£(\rÂ–(P=; \İôÁ Û‘\ç\Ğ\\®™À©¿›œA|‹¤ş$’LM\Ã\ç\Ëø1Q2K×‹‡ü«Z­\ê\"–®\Çrõœ=$û°7Ğ¬¹S,0‹`]:C\0\íºQ®q¡-CpW\Êvñ³\"\Õ\Ã\ê\'Ço\0\è€\È*\ãs\\ÀA7	«qğU’f\èZ}¨¶¢8ƒ\áù£\Èf®ü\0gÆ³®[—@¯ŠqbR?Áµ\ÔK5\ß\ã¤yrº\\Q«iYwÙ“5š\à} ½Iy³.„=\ÑÁT`÷i\îD\ÒK¡6)ò\çõW+\İö§ôPû\ëİú\ĞFşGƒ2P6ª\íVf/!#$g1VF?<Ö¸õV€\æC\Ó\Øü‹\êU­(˜	B\à\à~÷\ä½Î,\É\×.7t&Ÿ²e‹m\ã\ï-/A,eœª¿Z›÷G‹Q®2]6Î‡\Ë\r;\æ\ï½jR\Ö$©)\æ\È\âKL=$\ì\Îÿ¨a¦\":¶2\Z–\Æ\É\ÙÙ®|o¼P‹!·\Ğcsi9ƒ¡‡*dº\äıTó®.“~	œğH\à\é¥%Å\ŞutjVA$%ø\ÊÁ‹<óMa£œ\\_\Ê\íÖª!8Šna\à\Ğ%-\ŞŒWŠ“ğ\é=®]Á^t\Ï8$§@¨óT˜±H6g—;\Î\Ğ&I_ğXP\n&X \ÚKU\Ë\ç/U\Ç\ä3o\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0'),(20,'Miguel','tuzo@gmail.com','7272727275','2025-05-26',_binary '\0øv\È*\ãs\\ÀA7	«qpLU’\Ğ|õ;\ÇY;F,\î\ÅÍ³ö|0EOoA\×\Ï\Ä\ìÏ¦\\t¾,[¢\âıü‚¼I}…©2Á.Iv\Ë\Z©¨³\ÌC\Â\Í?vÁ»²\èG`÷¾‡%õ¥\'\ßŒw\æ7ÿ \Õ\ÌÍ‡–jG”\ÏRV ·ü£\Û\ÉÊ‹ğ/Œ,\Ç\Ó\Äe\ãô\ì\×/j•%\ÓŸ+Kù9\\º±	ˆ\"u¶>\r\×VğSÌ½ŒL\Õ(\â#C\Ñıæ¾¥?‡+Bğ\nU~Í¯X!s\ì\îSPşB½£Ğ”j\Ñ#GŸø\ÔÅ˜=ôª†‡{ò\\H´Ï±€\ß%L3$J>\ÅBG}\ÈÿóL^ZV¬5›#ub,ù˜C{\Óz\é,\ÑSúÎ¥\Ú\Ñ!y´\Ñ\Ñ@µ¯µ~\Û\Øh=e\ê”w¾`Y÷»U, \á¥Ëhš\ìO~ycı+C­B¼!Z”\éÏ–š¬è›¥}·zWiAS\ÃCñ¿!5uo\0øm\È*\ãs\\ÀA7	«qp»U’)]6;%ˆ$š„p¢ºgFRd82Zqi}€\ZZMU[!w¨\Û^=K°dï‚…k\ÎO“nmV\Â\Ön}5ık_xáªšwp\nŞ£ó„¦\É|~‰7€u© eğ<H¿£dlÁ26a¥µ¶\'„:3NM\Ôy\ËDm! •É²¸6\\\ZSe›e\î\Í\Î]\ï{œ_\ìƒA5I\ÉR_iª\'nõŠ¢GŠ\ãmZ=½\â“\Ò1…Rõ1>Ú®pr‹¼\åô°\ë\ÏŞ“\ëşy¾taôó7\ïV|÷‚ÿ`I\0òœGÂ€t\ÎGû=«#\Ì\âM[iN}\ì$Eoó\İ9‰á‡˜y‚P.Ó©ò2¤\×!–,l\åqpo({`!U\ÏbğÁMs\Âô®\Å\Û`6¼/\Üar\Ö\Ç\å€8\0€ø?y¥Œs«%¢œ‰+¨\Î„ô\Ì3ôY\Ûø%ğOY\Õ:\Ò\ëtn@¸Œ“öBD¢\ÛS\à\\\æ†\ÚdÀo\0øg\È*\ãs\\ÀA7	«qp¦U’\ÇğIñ/C¡\0\ÑCv$l3\í-Àl-ôO’²Uˆ;\Øú[Œ¦Ü¯\Ük\Óû¤€ß©\ÇbRö­Ï“ú©±Ÿ=¼\ì\Øu’^\áp±’;Ì½G\áK‹\Õ\á1ó×œRt³[}*\Ìd¼\ÎC©º ¸\íöYQ9\× À¥$\èˆ\ïF×¯\ë\ç|\Â}4´n:xT§:•¡Üšoª/•ª„„Kj6\ÈN*­R’9¹©R·)„tk\İ\ß\í‚	i—X?\Ş\ËCô²Vr…³\n\Ì\×;¬Z€.ƒi\Õù³ï¦¤Š\æ\çÏ°ÉŒÛ²Ë÷À\éT	c€\Ñ>\è)\æ\Ø\â_ÿ%\ê¨ùğ|‚\Ş\Ğl¥,™_\Å:/½½\æ\Ã8ö\ï\r \"$@¿ùßœ“ô€2\âodR\'F6”(ƒmP\ÃĞµy\à\ßğ\Z.Ÿ\Âôs_ph”Á¢\Ú\î.DŠZH\Øx\Ğ$o\0\è^\È*\ãs\\ÀA7	«q°±U’°\Ä\İwa2¿xU«¨²“r–ã¢— ¶ÿ\\o\0n¥‡u-\ÈZ„58‡”LaöCğ/\êÔ—9p\é\ã8U\ÈYˆtNF\È\nU)a„z™‰úqª§¶\Ê:}\0½\ß\Êõ–\çŸ\é;\Şñ\Ô\Õ\×u<JDjŸ\éXkª\á~\â «\Ï\ïš\\²Î€\\Â‘^hrö[{ñ\Ë3°e64k\í¾‚7~‰Tµ<ö/F¸›\ç°eNYZ\ßL®8;\Ğ\îo\\eš\ß9öv´V\Ë\nÙÎ‰\ÜRYr=ÀkŒú‰¨Ÿ\ç0·\'zMD\ÜÍ„ Á–_j3¨;}	\ß\ã2o\Ô\ïm\"\æ\äZü‘0Zr±B´†~ş0Q[o\ÛZ_·>…ş\è¬GùW†\ÃWÅ“ú¿\Ûüd„sˆ›@9Bş’\ÌoX¨\Ã9\ì\ì²\Ğù\ï\ÄüûGI \â`ú³û‘\ÃT\Û\nho\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0');
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
INSERT INTO `entrenador` VALUES (1,'Miguel Torres','miguel.torres@correo.com','5553214567',_binary '\0ø6\È*\ãs\\ÀA7	«q°\İU’\ßZ\Ç\Û\ÊÚº‘øÒˆ\áµÁğ}	WŞ˜TisøÀY‘\×şz	\è§®\Ğt‹®†¯+G—\í\àeğ\08xb\Õ4N!\Ú\Ùt9ü¿-{Âˆ?›E©pc\æ\æ=ˆ0ók½*\Éû²`$#õ\Æ§\É_Œ?\è\Ì\Ëi\é+\ë«X“\ïŠ8E—\İ6D\Ô	È¦P\Ï\è\rö¥l¾o~\ìˆ\Æ`¬‰W„\Å-\à\ËÌ ›\æ†D\Ø\àm‰	¯˜+¼w]–Î®ı\Ìm`¨V„®\Ã/™¥Is\Ç\àÉ¯`\'7º\â\ÙN\Öıï·ˆğ¨yc5Q\á\Âf¹÷LşVIWñ\Ò\ÓpNôdIL”ñ$‹¨2\îüº\èù\Éù`I\Z—ñ\ÔNù\Ö:,ÅŒ…s‘ôD]ƒ•|À\çüo\0ø?\È*\ãs\\ÀA7	«q°\İU’\r\ß)ù\ÜÁÙ“®Š[nÂš¶\Û40£ NS{|¨´\îD\'R“)\ÚúŸ&\Î\ì\Éı~%\êMkdD£“\ßfKò¡0<3³–IœŠÁó…îš…\ÙC\ØQ ®¢xJ[‹ƒ\Zk%QC(xº¶‡Rò\ÆA}¤\ÕöYÃƒV¼²M´GŒJ\Ëú€ôZoOMÉ³{^uiòVJò\Í ı:¥¯S[¹v[9\é\0æ””“ıÍ…r»Şµ’\rX¾|eĞ…XsÀlHYjø[n\r]œ\É.ÀAQ@/‘“C:Œ\Ú0“œi­\rZÁª¿\Ï&º2\å\Øñ]a SuWMv†T~\Z	‚q.\Ñù¬€`˜ZvÊ»Ë¥•r\ã½K\ïş¸2t\Çbg[õš\ÉÿØ¿¶d0g»\ÉOo\0ø-\È*\ãs\\ÀA7	«qp\ÈU’ô7\á>U¶9»b\Åq.\îˆV\Éø]~‘ó‚˜£Œ\êXú\áV\îN\"£Fù\á	¿€†T_6Š\0	sG*\ì\Æ$öD:™0 µ.ZÅ—u\ËõAW2KÁ\×Á\Æ\Ğ\0©dµ‚#¨\ÊŒ˜U=\ê€L¸@:˜¥Löñ\Ô\à57\Ü!.ş1\"x†\è²s…·N/óbCD2V_Eq€\É7ÿ§öv:`”±)}¶\ÄK\Í\×7\ãxs¼<Su²\0¨\âë»M•dğn}$ˆ\à\èô*c…›\Ğ¯ƒ\Éø÷ğLÒ‡²e—Ÿ¢5\Ëø‹Œxò#¦û¥\Ø#iy€¯A\Í:‘k?º©\Û\ëŸKt ú\Ïş‚j\í=ó\àÌ±o\ëP\Öq\r\èCQ2}‡\ÈBôù»\'s\0\æo\0\èQ\È*\ãs\\ÀA7	«q°\ÆU’×¤±›\Í#G‘\ÂSE6| ö¾Ú¿µ¸&$\Ğ4\ï%Hnü½&Û¡\Õš—ıƒ)û—\ÓÁ[D\ê|…–ºÀş½\Æ\Şz/¿\æÖÑ®¹d\ÎXuw¸[¬œ9–j\Ê7¹¬$¾»\r‹üzM\æsZFiQ\\¼•n§I\Z\ïDb’\Øy%	_Á®xT3úns8\Õô5=.\áGü(\Ø\èK¦:½\ÚW\ç%\Å[ÕŒ¤£_3o\Ì62ŸŞ£tpD\Ì\åü—@•\Ç3¨¡ş‚”kø&|`ºvA\ĞùRòĞ´ûƒ^¥ñ~E\Ú\ZB8¶}`»ì¥Ÿ©‘ùŸ	2jR²r‡C!KVƒÀcû®Á\"´«T–\×\0:2IœêŒƒ8\íg\ï–f0Ğ‹“ºSıCü(e~\×}&\Ç@|\æ\Ú\ïøñNh7úûğ\İ\éo\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0'),(2,'Ana LÃ³pez','ana.lopez@correo.com','5556547890',_binary '\0ø€\È*\ãs\\ÀA7	«q°\×U’\Æ\ã•\Ø9¤@p\Çğ“E\Ãı½.\É\Éw-\rHJKU¯Á\0^%x.0vPP\æ\'apØ‘v©Ñ·=½\Ü\Ë!—\ì(Áyp„B¬\æ /\Õe\Äö¼HTÆµòÒ»T\ëÀd•ò«­\r!h¥»[ej¢\à1†D\Ö\n¤ˆö¿\ãX\í\ÕÚˆ\Óy¦®«4|\'\ÈM\ã,\ìÁË´	Yõ¢@\îÀp·7¶S%tú?vÄŸ˜ıo‡ñ\èS\nD»K~«¥aw§\ÚD\ÏùûO˜	\ßY\í…\Í_ù¹+²wW\à2vta4ğ.\Ü%ÿcˆØšŠ¡Ù¼ -\07·(\Ãğøc„\Ñ!õ¾u&ñ\ïñš”„½¹Gƒ¥(z &#¼‰tÍ‹ N \Z:\Ê!cı’¤ŒL\Ï\çk&gU\rŸiÅ²¶bı8;Zˆm3C\Û-\n.+`”ñ\á¯_b4(\Ğ4\ÔNua¦ÿ\çz°xR³ªo©mlñF\ì\Ç\'\r4M\Ú&WCµ„›Áo\0ø€\È*\ãs\\ÀA7	«q°\×U’\Æ\ã•\Ø9¤@p\Çğ“E\Ãı½.\É\Éw-\rHJKU¯Á\0^%x.0vPP\æ\'apØ‘v©Ñ·=½\Ü\Ë!—\ì(Áyp„B¬\æ /\Õe\Äö¼HTÆµòÒ»T\ëÀd•ò«­\r!h¥»[ej¢\à1†D\Ö\n¤ˆö¿\ãX\í\ÕÚˆ\Óy¦®«4|\'\ÈM\ã,\ìÁË´	Yõ¢@\îÀp·7¶S%tú?vÄŸ˜ıo‡ñ\èS\nD»K~«¥aw§\ÚD\ÏùûO˜	\ßY\í…\Í_ù¹+²wW\à2vta4ğ.\Ü%ÿcˆØšŠ¡Ù¼ -\07·(\Ãğøc„\Ñ!õ¾u&ñ\ïñš”„½¹Gƒ¥(z &#¼‰tÍ‹ N \Z:\Ê!cı’¤ŒL\Ï\çk&gU\rŸiÅ²¶bı8;Zˆm3C\Û-\n.+`”ñ\á¯_b4(\Ğ4\ÔNua¦ÿ\çz°xR³ªo©mlñF\ì\Ç\'\r4M\Ú&WCµ„›Áo\0ø@\È*\ãs\\ÀA7	«qğÀU’Ë·õx\çŞ\å¶)GKúyü¸F~\â\'ócM)/\Ö\Ë\áõğ…úy|4©\Ü!\Ûğuçº¨\Ö@µt\Ä+aÕWU}ñ9\Îú\Æ$iµ!Ğ¸¾‡iœ‹v[Myh¹«†¶v\âZ“Ğ¡—$\ËiH“‡‘Œ‹\ä\á\Ï8\Ú%ò\ä	w\\aÙ¢ş\Ğãœ¬k¢\Åò^€\è\ëm%»€;‘P\Ø4E\':Ø˜&¢X\ïh\âİ¹\å\Ù\Ë\Óx\ÉkŠ@rNa:º\Ğ‰ş˜f,–u‚Åm›`4`\ß\Ëa«\âû½…M\Çl;€ö›±Õ¦	\Ã‚Mcø\Zis \Õ,®’§\Ğ\è£\ç$<±;€\Í\ĞĞº\Øjó¤‚‚\"S\â¤1\ÎJÃ±\0ÿ.¶¯“\îƒTGv+a\ZQ\nñ8†?ÿ C\Êÿ\ãøX\Ï4o\0\è@\È*\ãs\\ÀA7	«qğÀU’Ë·õx\çŞ\å¶)GKúyü¸F~\â\'ócM)/\Ö\Ë\áõğ…úy|4©\Ü!\Ûğuçº¨\Ö@µt\Ä+aÕWU}ñ9\Îú\Æ$iµ!Ğ¸¾‡iœ‹v[Myh¹«†¶v\âZ“Ğ¡—$\ËiH“‡‘Œ‹\ä\á\Ï8\Ú%ò\ä	w\\aÙ¢ş\Ğãœ¬k¢\Åò^€\è\ëm%»€;‘P\Ø4E\':Ø˜&¢X\ïh\âİ¹\å\Ù\Ë\Óx\ÉkŠ@rNa:º\Ğ‰ş˜f,–u‚Åm›`4`\ß\Ëa«\âû½…M\Çl;€ö›±Õ¦	\Ã‚Mcø\Zis \Õ,®’§\Ğ\è£\ç$<±;€\Í\ĞĞº\Øjó¤‚‚\"S\â¤1\ÎJÃ±\0ÿ.¶¯“\îƒTGv+a\ZQ\nñ8†?ÿ C\Êÿ\ãøX\Ï4o\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0'),(8,'Sandoval','san@gmail.com','8736666666',_binary '\0ø\\\È*\ãs\\ÀA7	«qp\ÛU’×­E])	;mÀaù\â<‰Ú“=C	w0\æ\íå‘‘$[µÈcú…¢˜¢\Ú¹•\Ér\Óñ¿\È÷s\'\Ü\Ê[kJ)„r(\å¼R¼\ë)‰\í\ÆÀù\Ñe\Z¶„µZ\Ätg\ë`õQ•\Ë\nx\Å\Ú;\Ï\âK£\âzia\â7q¶\èó\ÊBU«_Y\àDl¦GC\á|Ğ¡\Êj\ÈK\×\ë\ËC2•wR¯Àxš\Å:.AyÇ­ñ*7ÿÑ·°°(=\ØDPªµ\àù\Z=pO(óhŠ:z¸¼on@¢\0†:Gib‘	ƒ]=‚øÔ¸óiU*šü9º”SF< ø¾JÌ›q0Ç»û”\êmƒ\ÌĞ•KjS›b\0Rjõ\Â0\']ZõMw­7«o\0L¬\İ-}\ë\âü *]™!µ+sÙ¾\ë£+\Í\Ømt4(_\ÄN©\à)ó\í~¸o´¦¿ûJJ4WCo\0ø;\È*\ãs\\ÀA7	«qğ\ÕU’»VùÄ«Qw\âYÇšwd£HN\ÏS\ŞA˜Uˆ\Ú1û«H=S\ÏÖ¢—­û¤ÿuz¥\ÑWü–©)g\r{¸š7e\×\Ü\Ñ7\âù\Zb\Óv)Lş³9ôr­üW½ ¤&]~8û\Ê÷\İ6ª©f/z\Í5¨¥4‰ù<ÿZYˆa™s€%ú£ñÁa\"0¹B ¯&q–\î\Óÿ\ZD\áGü¸\í¡\Ï\Ş[§3d§–C 6Cµ\Â~Ê•F(\éSõ\å¾\Îo•\ÕrØ‘…(ª”PEJ\rK¢ ¦¤M\Züğü*·	ıòº]\Â^\ê\í\Í\0²y~ƒ/Js>wKmt\âe\çö5\ë\î„ï„›Ş’2e<1­8´œ\ÅJ…ù›‚XDöo\ŞkÁ»­\Óg÷ 5•“  \ê\î¿òq\æ¨$š\rõe\Éğğo\0øñ\0\È*\ãs\\ÀA7	«qp\ØU’•‘óŒ\í€(\åô\á¬\î¬R`1%\æ\Ç=Ëºö¾Íƒ\ínLU\Íh†… WÁ\è\áó¯M İŠ¼‹a¿+ÁMWu\Õ41K\Ï\Z\'˜`°\èt\æ¢%8 Sb\å3¯\'ş\Îv\áHp)\Ñ\'bh»¦b…3jŒQ±vs}S‡øÊ¦\Ô-U-«%\Ã\èO\Ö\İV¬\'˜LôLTÉŠ7dş)\Ú\áş»\Ê^\íñÊª¢»·…L`ÒŒ†yPçŸš^\Ü$&a#²²Qt\êy\ì%\ä\ÏL-\êpi([ôš\ç*Jg­Gœ(}Hµo\0\è[\È*\ãs\\ÀA7	«q0\ÖU’mq¿¥\ÎJ³?x^½½QG@DV`\r§ñ–edMŒ\Z\Ø«/bš£¥\"\ì•?2\ÛIñˆA«Dg\Ë*3Ê¶\í\ØUDı•\É÷\Ú`A\Ş/±ä²»¬}-ù\Ã>¸û«!·e½S\ÕZFyò®V\×\Ú}D\Ñc\Ì\Ïp†®\íc¼§ ¿{‡¿ƒ9\Îpr\ê\Ö\â†e_v\Ûs1°\í;7\"\n‘L’N†Sj\nö§\'P\'ª‡\n\ây\"v3t$q\Ğ„%\Ñ-f\0Í›O™c\í\î\Ójˆ*lœ\Ú\á5ª\Ï\ïû_nNp\Ï#œıvD6±\0Á|‚¦\É4l\ëÛ€i<3­\Ó\î‚\×üA\'n\İ\Ã\æ\å	³E©!E\É\Ìw³®/4\rZ`|¬ß—{;Û—À\Ûğ\ä-¹µ÷Ö«³n{¡ş\Ğ©‚€\Æaş43*pg\Ö.Ùú/K\Ò\Øşp“\Æm:oë©¸nQ\Ç0z»o\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0');
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
INSERT INTO `especialidades` VALUES (1,'Entrenamiento Funcional'),(2,'MusculaciÃ³n');
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
  `dia_semana` enum('Lunes','Martes','MiÃ©rcoles','Jueves','Viernes','SÃ¡bado','Domingo') NOT NULL,
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
INSERT INTO `horario` VALUES (1,1,'Lunes','08:00:00','12:00:00'),(2,2,'MiÃ©rcoles','16:00:00','20:00:00');
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
INSERT INTO `tarea_mantenimiento_administrador` VALUES (1,'SupervisiÃ³n de mantenimiento general',1,'Pendiente','2024-06-07'),(2,'AuditorÃ­a de equipos de seguridad',2,'Completada','2024-06-06');
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
INSERT INTO `tarea_mantenimiento_entrenador` VALUES (1,'RevisiÃ³n de bandas elÃ¡sticas',1,'Pendiente','2024-06-08'),(2,'Inventario de colchonetas',2,'En Proceso','2024-06-09');
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
