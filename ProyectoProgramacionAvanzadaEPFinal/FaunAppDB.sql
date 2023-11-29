-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Nov 29, 2023 at 03:39 AM
-- Server version: 10.4.32-MariaDB
-- PHP Version: 8.2.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `proyecto`
--

-- --------------------------------------------------------

--
-- Table structure for table `fauna`
--

CREATE TABLE `fauna` (
  `faunaID` int(100) NOT NULL,
  `nombreCientifico` varchar(128) NOT NULL,
  `nombreComun` varchar(128) NOT NULL,
  `ubicacion` varchar(128) NOT NULL,
  `alimentacion` varchar(128) NOT NULL,
  `peligrosidad` int(10) NOT NULL,
  `taxonomiaID` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `fauna`
--

INSERT INTO `fauna` (`faunaID`, `nombreCientifico`, `nombreComun`, `ubicacion`, `alimentacion`, `peligrosidad`, `taxonomiaID`) VALUES
(1, 'Puma concolor', 'Puma', 'Todo Chile', 'Carnívoro', 7, 1),
(2, 'Vultur gryphus', 'Cóndor', 'Zonas montañosas', 'Carnívoro', 2, 2),
(3, 'Lama guanicoe', 'Guanaco', 'Regiones Andinas', 'Herbívoro', 1, 3),
(4, 'Chloephaga picta', 'Caiquén', 'Humedales y lagunas', 'Omnívoro', 0, 4),
(5, 'Vicugna vicugna', 'Vicuña', 'Altiplano', 'Herbívoro', 1, 5),
(6, 'Lycalopex culpaeus', 'Zorro Culpeo', 'Todo Chile', 'Omnívoro', 3, 6),
(7, 'Phoenicopterus chilensis', 'Flamenco Chileno', 'Zonas lacustres', 'Omnívoro', 0, 7),
(8, 'Chinchilla lanigera', 'Chinchilla', 'Región Metropolitana', 'Herbívoro', 4, 8),
(9, 'Leopardus guigna', 'Gato Montés', 'Bosques del sur', 'Carnívoro', 5, 9),
(10, 'Lutra provocax', 'Nutria', 'Ríos y lagos', 'Carnívoro', 2, 10);

-- --------------------------------------------------------

--
-- Table structure for table `flora`
--

CREATE TABLE `flora` (
  `FloraID` int(100) NOT NULL,
  `nombreCientifico` varchar(128) NOT NULL,
  `nombreComun` varchar(128) NOT NULL,
  `Funcion` varchar(128) NOT NULL,
  `Descripcion` varchar(128) NOT NULL,
  `taxonomiaID` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `flora`
--

INSERT INTO `flora` (`FloraID`, `nombreCientifico`, `nombreComun`, `Funcion`, `Descripcion`, `taxonomiaID`) VALUES
(1, 'Araucaria araucana', 'Pehuén', 'Árbol Nativo', 'El Pehuén es un árbol nativo de los bosques templados de Chile. Sus piñones son comestibles y tienen un significado cultural imp', 11),
(2, 'Nothofagus dombeyi', 'Coihue', 'Árbol Nativo', 'El Coihue es un árbol de hoja perenne que se encuentra en bosques húmedos del sur de Chile. Es apreciado por su madera y su pape', 12),
(3, 'Mimosa tenuiflora', 'Espino', 'Planta Medicinal', 'El Espino es una planta con propiedades medicinales. Se utiliza tradicionalmente en la medicina popular chilena para diversas do', 13),
(4, 'Eucryphia cordifolia', 'Ulmo', 'Árbol Nativo', 'El Ulmo es un árbol nativo de Chile que crece en bosques húmedos. Sus flores blancas y fragantes son apreciadas, y su madera es ', 14),
(5, 'Lomatia hirsuta', 'Radal', 'Árbol Nativo', 'El Radal es un árbol nativo de los bosques andinos de Chile. Sus hojas son persistentes, y es apreciado por su valor ornamental.', 15),
(6, 'Quillaja saponaria', 'Quillay', 'Árbol Nativo', 'El Quillay es un árbol nativo de Chile conocido por su corteza rica en saponinas. Se utiliza tradicionalmente como detergente na', 16),
(7, 'Azara dentata', 'Corcolén', 'Arbusto Nativo', 'El Corcolén es un arbusto nativo de Chile con hojas perennes. Sus pequeñas flores amarillas son atractivas para insectos poliniz', 17),
(8, 'Nothofagus antarctica', 'Ñire', 'Árbol Nativo', 'La Ñire es un árbol nativo de los bosques subantárticos de Chile. Es apreciada por su madera y su papel en la conservación de ec', 18),
(9, 'Bromus berteroanus', 'Pasto Blando', 'Planta Forrajera', 'El Pasto Blando es una planta forrajera común en praderas chilenas. Es utilizado como alimento para el ganado.', 19),
(10, 'Myrceugenia exsucca', 'Arrayán', 'Arbusto Nativo', 'El Arrayán es un arbusto nativo de Chile con corteza característica y pequeñas bayas comestibles. Tiene importancia cultural y o', 20);

-- --------------------------------------------------------

--
-- Table structure for table `informacion`
--

CREATE TABLE `informacion` (
  `informacionID` int(100) NOT NULL,
  `textoPrincipal` varchar(128) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `informacion`
--

INSERT INTO `informacion` (`informacionID`, `textoPrincipal`) VALUES
(1, 'En el cuidado y conservación de la fauna silvestre, evita dejar basura en áreas naturales y respeta los hábitats naturales de lo'),
(2, 'Para identificar especies nativas en entornos naturales, lleva una guía de campo y presta atención a las características clave d'),
(3, 'Practica sostenibilidad en jardinería cultivando plantas autóctonas y evitando el uso excesivo de pesticidas y fertilizantes quí'),
(4, 'Contribuye a la conservación de ecosistemas acuáticos evitando la contaminación del agua y participando en proyectos locales de '),
(5, 'Gestiona residuos de manera responsable para proteger el medio ambiente. Reduce, reutiliza y recicla para minimizar el impacto e'),
(6, 'Reduce el uso de plásticos adoptando alternativas sostenibles como bolsas reutilizables, botellas de agua recargables y utensili'),
(7, 'Fomenta la educación ambiental destacando la importancia de las áreas protegidas y participando en actividades de concientizació'),
(8, 'Consejos para reducir la huella de carbono: utiliza transporte público, ahorra energía en casa y apoya a empresas comprometidas '),
(9, 'Cuida el suelo y previene la erosión mediante prácticas como la siembra de cubiertas vegetales y la implementación de técnicas d'),
(10, 'Practica el uso responsable de recursos naturales, como la recolección ética de plantas y la participación en proyectos de refor'),
(11, 'Científicos descubren una nueva especie de orquídea en la región de Los Ríos. La biodiversidad de Chile sigue sorprendiendo.'),
(12, 'Investigadores documentan el comportamiento del puma en la Cordillera de los Andes. Detalles fascinantes sobre este felino emble'),
(13, 'Éxito en la reproducción en cautiverio del cóndor andino. Un paso importante para la conservación de esta majestuosa ave.'),
(14, 'Estudio revela la importancia del guanaco en la regulación de ecosistemas andinos. Descubre el papel crucial de esta especie en '),
(15, 'Descubrimiento de nueva planta medicinal en el sur de Chile. Conoce más sobre sus propiedades y su uso en la medicina tradiciona'),
(16, 'Investigadores observan el comportamiento de zorros culpeo en entornos urbanos. Detalles sobre cómo estas criaturas se adaptan a'),
(17, 'Avistamiento raro: flamencos chilenos en laguna deshabitada. Un fenómeno natural que ha sorprendido a la comunidad científica.'),
(18, 'Éxito en la restauración de hábitat para la nutria en zonas de ríos y lagos. Un logro para la conservación de esta especie acuát'),
(19, 'Nuevo estudio resalta la importancia del Arrayán en la cultura mapuche. Descubre la conexión entre esta planta y la historia ind'),
(20, 'Desarrollan programa para la conservación del pehuén en bosques templados. Iniciativas para proteger y preservar esta especie em');

-- --------------------------------------------------------

--
-- Table structure for table `noticia`
--

CREATE TABLE `noticia` (
  `noticiaID` int(100) NOT NULL,
  `titulo` varchar(128) NOT NULL,
  `fecha` date NOT NULL,
  `autor` varchar(128) NOT NULL,
  `informacionID` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `noticia`
--

INSERT INTO `noticia` (`noticiaID`, `titulo`, `fecha`, `autor`, `informacionID`) VALUES
(1, 'Descubren Nueva Especie de Orquídea en la Región de Los Ríos', '2023-11-01', 'Elena Botánica', 11),
(2, 'Investigadores Documentan el Comportamiento del Puma en la Cordillera de los Andes', '2023-10-25', 'Carlos Faunólogo', 12),
(3, 'Éxito en la Reproducción en Cautiverio del Cóndor Andino en Proyecto de Conservación', '2023-10-20', 'Ana Bióloga', 13),
(4, 'Estudio Revela la Importancia del Guanaco en la Regulación de Ecosistemas Andinos', '2023-10-15', 'Diego Ecólogo', 14),
(5, 'Descubrimiento de Nueva Planta Medicinal en el Sur de Chile', '2023-10-10', 'Lucía Herbalista', 15),
(6, 'Investigadores Observan el Comportamiento de Zorros Culpeo en Ambientes Urbanos', '2023-10-05', 'Felipe Zoólogo', 16),
(7, 'Avistamiento Raro: Flamencos Chilenos en Laguna Deshabitada', '2023-09-28', 'Isabel Ornitóloga', 17),
(8, 'Éxito en la Restauración de Hábitat para la Nutria en Zonas de Ríos y Lagos', '2023-09-22', 'Martín Conservacionista', 18),
(9, 'Nuevo Estudio Resalta la Importancia del Arrayán en la Cultura Mapuche', '2023-09-18', 'Camila Historiadora', 19),
(10, 'Desarrollan Programa para la Conservación del Pehuén en Bosques Templados', '2023-09-12', 'Gabriel Ambientalista', 20);

-- --------------------------------------------------------

--
-- Table structure for table `region`
--

CREATE TABLE `region` (
  `regionID` int(17) NOT NULL,
  `nombre` varchar(128) NOT NULL,
  `clima` varchar(128) NOT NULL,
  `descripcion` varchar(128) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `region`
--

INSERT INTO `region` (`regionID`, `nombre`, `clima`, `descripcion`) VALUES
(1, 'Arica y Parinacota', 'Desértico', 'La región de Arica y Parinacota se encuentra en la zona norte de Chile y tiene un clima desértico. Destaca por sus hermosos pais'),
(2, 'Tarapacá', 'Desértico', 'Tarapacá es una región ubicada en el norte de Chile, con un clima desértico. Iquique es una de las ciudades más importantes de e'),
(3, 'Antofagasta', 'Desértico', 'Con un clima desértico, la región de Antofagasta es conocida por su riqueza en recursos minerales y hermosos paisajes costeros.'),
(4, 'Atacama', 'Desértico', 'La región de Atacama es la más árida del mundo y cuenta con un clima desértico. Destaca por el Valle de la Luna y la ciudad de C'),
(5, 'Coquimbo', 'Desértico', 'Con un clima desértico, la región de Coquimbo es famosa por sus observatorios astronómicos y hermosas playas. Incluye ciudades c'),
(6, 'Valparaíso', 'Mediterráneo', 'La región de Valparaíso tiene un clima mediterráneo, con veranos secos e inviernos suaves. Valparaíso y Viña del Mar son ciudade'),
(7, 'Metropolitana de Santiago', 'Mediterráneo', 'La región Metropolitana, donde se encuentra Santiago, tiene un clima mediterráneo con estaciones bien definidas. Es el centro ec'),
(8, 'Libertador General Bernardo O\'Higgins', 'Mediterráneo', 'Con un clima mediterráneo, esta región es conocida por sus paisajes agrícolas y viñedos. Rancagua es una de las principales ciud'),
(9, 'Maule', 'Mediterráneo', 'El clima mediterráneo de la región Maule favorece la agricultura. Talca es una de las principales ciudades de esta zona.'),
(10, 'Ñuble', 'Templado lluvioso', 'La región de Ñuble tiene un clima templado lluvioso con influencia oceánica. Destaca por su belleza natural y biodiversidad.'),
(11, 'Biobío', 'Templado lluvioso', 'Con un clima templado lluvioso, la región del Biobío incluye ciudades como Concepción y destaca por su actividad industrial y po'),
(12, 'La Araucanía', 'Templado lluvioso', 'Esta región tiene un clima templado lluvioso con inviernos lluviosos. Es conocida por su rica cultura mapuche y hermosos paisaje'),
(13, 'Los Ríos', 'Lluvioso', 'La región de Los Ríos se caracteriza por su clima lluvioso y hermosos cuerpos de agua. Incluye ciudades como Valdivia y Villarri'),
(14, 'Los Lagos', 'Lluvioso', 'Con un clima lluvioso, la región de Los Lagos es famosa por sus lagos y paisajes montañosos. Puerto Montt y Osorno son ciudades '),
(15, 'Aysén del General Carlos Ibáñez del Campo', 'Frío y húmedo', 'La región de Aysén se caracteriza por su clima frío y húmedo, con paisajes impresionantes. Coyhaique es la ciudad más grande de '),
(16, 'Magallanes y de la Antártica Chilena', 'Frío y húmedo', 'Ubicada en el extremo sur de Chile, esta región tiene un clima frío y húmedo. Destaca por su belleza natural, glaciares y la ciu');

-- --------------------------------------------------------

--
-- Table structure for table `taxonomia`
--

CREATE TABLE `taxonomia` (
  `taxonomiaID` int(100) NOT NULL,
  `Division` varchar(128) NOT NULL,
  `Orden` varchar(128) NOT NULL,
  `SubDivision` varchar(128) NOT NULL,
  `Clase` varchar(128) NOT NULL,
  `Especie` varchar(128) NOT NULL,
  `Familia` varchar(128) NOT NULL,
  `Genero` varchar(128) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `taxonomia`
--

INSERT INTO `taxonomia` (`taxonomiaID`, `Division`, `Orden`, `SubDivision`, `Clase`, `Especie`, `Familia`, `Genero`) VALUES
(1, 'Chordata', 'Carnivora', 'Mamíferos', 'Mammalia', 'Concolor', 'Felidae', 'Puma'),
(2, 'Chordata', 'Accipitriformes', 'Aves', 'Aves', 'Gryphus', 'Cathartidae', 'Vultur'),
(3, 'Chordata', 'Artiodactyla', 'Mamíferos', 'Mammalia', 'Guanicoe', 'Camelidae', 'Lama'),
(4, 'Chordata', 'Anseriformes', 'Aves', 'Aves', 'Picta', 'Anatidae', 'Chloephaga'),
(5, 'Chordata', 'Artiodactyla', 'Mamíferos', 'Mammalia', 'Vicugna', 'Camelidae', 'Vicugna'),
(6, 'Chordata', 'Carnivora', 'Mamíferos', 'Mammalia', 'Culpaeus', 'Canidae', 'Lycalopex'),
(7, 'Chordata', 'Phoenicopteriformes', 'Aves', 'Aves', 'Chilensis', 'Phoenicopteridae', 'Phoenicopterus'),
(8, 'Chordata', 'Rodentia', 'Mamíferos', 'Mammalia', 'Lanigera', 'Chinchillidae', 'Chinchilla'),
(9, 'Chordata', 'Carnivora', 'Mamíferos', 'Mammalia', 'Guigna', 'Felidae', 'Leopardus'),
(10, 'Chordata', 'Carnivora', 'Mamíferos', 'Mammalia', 'Provocax', 'Mustelidae', 'Lutra'),
(11, 'Plantae', 'Araucariales', 'Gimnospermas', 'Pinopsida', 'Araucana', 'Araucariaceae', 'Araucaria'),
(12, 'Plantae', 'Fagales', 'Dicotiledóneas', 'Magnoliopsida', 'Dombeyi', 'Nothofagaceae', 'Nothofagus'),
(13, 'Plantae', 'Fabales', 'Dicotiledóneas', 'Magnoliopsida', 'Tenuiflora', 'Fabaceae', 'Mimosa'),
(14, 'Plantae', 'Myrtales', 'Dicotiledóneas', 'Magnoliopsida', 'Cordifolia', 'Cunoniaceae', 'Eucryphia'),
(15, 'Plantae', 'Proteales', 'Dicotiledóneas', 'Magnoliopsida', 'Hirsuta', 'Proteaceae', 'Lomatia'),
(16, 'Plantae', 'Rosales', 'Dicotiledóneas', 'Magnoliopsida', 'Saponaria', 'Rosaceae', 'Quillaja'),
(17, 'Plantae', 'Buxales', 'Dicotiledóneas', 'Magnoliopsida', 'Dentata', 'Flacourtiaceae', 'Azara'),
(18, 'Plantae', 'Fagales', 'Dicotiledóneas', 'Magnoliopsida', 'Antarctica', 'Nothofagaceae', 'Nothofagus'),
(19, 'Plantae', 'Poales', 'Monocotiledóneas', 'Liliopsida', 'Berteroanus', 'Poaceae', 'Bromus'),
(20, 'Plantae', 'Myrtales', 'Dicotiledóneas', 'Magnoliopsida', 'Exsucca', 'Myrtaceae', 'Myrceugenia');

-- --------------------------------------------------------

--
-- Table structure for table `tips`
--

CREATE TABLE `tips` (
  `tipID` int(100) NOT NULL,
  `area` varchar(128) NOT NULL,
  `informacionID` int(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `tips`
--

INSERT INTO `tips` (`tipID`, `area`, `informacionID`) VALUES
(1, 'Cuidado y Conservación de la Fauna Silvestre', 1),
(2, 'Identificación de Especies Nativas en Entornos Naturales', 2),
(3, 'Prácticas Sostenibles en Jardinería y Cultivo de Plantas', 3),
(4, 'Cómo Contribuir a la Conservación de Ecosistemas Acuáticos', 4),
(5, 'Gestión de Residuos para la Protección del Medio Ambiente', 5),
(6, 'Reducción del Uso de Plásticos y Alternativas Sostenibles', 6),
(7, 'Educación Ambiental: Importancia de las Áreas Protegidas', 7),
(8, 'Consejos para la Reducción de la Huella de Carbono', 8),
(9, 'Cuidado del Suelo y Prevención de la Erosión', 9),
(10, 'Prácticas Responsables en el Uso de Recursos Naturales', 10);

-- --------------------------------------------------------

--
-- Table structure for table `usuario`
--

CREATE TABLE `usuario` (
  `usuarioID` int(10) NOT NULL,
  `nombreDeUsuario` varchar(25) NOT NULL,
  `password` varchar(128) NOT NULL,
  `edad` int(100) NOT NULL,
  `CorreoElectronico` varchar(128) NOT NULL,
  `Genero` varchar(2) NOT NULL,
  `regionID` int(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `usuario`
--

INSERT INTO `usuario` (`usuarioID`, `nombreDeUsuario`, `password`, `edad`, `CorreoElectronico`, `Genero`, `regionID`) VALUES
(1, 'agu123', '123456789', 21, 'agucar@gmail.com', 'M', 1),
(2, 'Joaquintoro', '123123', 19, 'joaquintoro@gmail.com', 'M', 2),
(3, 'EmilyDavis', 'SafePassword789', 22, 'emily.davis@email.com', 'F', 4),
(4, 'DavidClark', 'Secret123', 30, 'david.clark@email.com', 'M', 5),
(5, 'SophiaMiller', 'P@ssw0rd', 29, 'sophia.miller@email.com', 'F', 3),
(6, 'DanielLee', 'MySecurePwd', 33, 'daniel.lee@email.com', 'M', 10),
(7, 'OliviaWhite', 'Pass1234', 26, 'olivia.white@email.com', 'F', 9),
(8, 'JamesBrown', 'SecurePass!23', 31, 'james.brown@email.com', 'M', 7),
(9, 'AvaWilliams', 'P@ssw0rd789', 27, 'ava.williams@email.com', 'F', 5),
(10, 'LiamTaylor', 'StrongPwd456', 32, 'liam.taylor@email.com', 'M', 6),
(11, 'admin', 'admin', 30, 'admin@admin.com', 'M', 9);

--
-- Indexes for dumped tables
--

--
-- Indexes for table `fauna`
--
ALTER TABLE `fauna`
  ADD PRIMARY KEY (`faunaID`),
  ADD KEY `taxonomiaID` (`taxonomiaID`);

--
-- Indexes for table `flora`
--
ALTER TABLE `flora`
  ADD PRIMARY KEY (`FloraID`),
  ADD KEY `taxonomiaID` (`taxonomiaID`);

--
-- Indexes for table `informacion`
--
ALTER TABLE `informacion`
  ADD PRIMARY KEY (`informacionID`);

--
-- Indexes for table `noticia`
--
ALTER TABLE `noticia`
  ADD PRIMARY KEY (`noticiaID`),
  ADD KEY `informacionID` (`informacionID`);

--
-- Indexes for table `region`
--
ALTER TABLE `region`
  ADD PRIMARY KEY (`regionID`);

--
-- Indexes for table `taxonomia`
--
ALTER TABLE `taxonomia`
  ADD PRIMARY KEY (`taxonomiaID`);

--
-- Indexes for table `tips`
--
ALTER TABLE `tips`
  ADD PRIMARY KEY (`tipID`),
  ADD KEY `informacionID` (`informacionID`);

--
-- Indexes for table `usuario`
--
ALTER TABLE `usuario`
  ADD PRIMARY KEY (`usuarioID`),
  ADD KEY `regionID` (`regionID`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `informacion`
--
ALTER TABLE `informacion`
  MODIFY `informacionID` int(100) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=21;

--
-- AUTO_INCREMENT for table `region`
--
ALTER TABLE `region`
  MODIFY `regionID` int(17) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=17;

--
-- AUTO_INCREMENT for table `taxonomia`
--
ALTER TABLE `taxonomia`
  MODIFY `taxonomiaID` int(100) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=21;

--
-- AUTO_INCREMENT for table `usuario`
--
ALTER TABLE `usuario`
  MODIFY `usuarioID` int(10) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=12;

--
-- Constraints for dumped tables
--

--
-- Constraints for table `fauna`
--
ALTER TABLE `fauna`
  ADD CONSTRAINT `fauna_ibfk_1` FOREIGN KEY (`taxonomiaID`) REFERENCES `taxonomia` (`taxonomiaID`);

--
-- Constraints for table `flora`
--
ALTER TABLE `flora`
  ADD CONSTRAINT `flora_ibfk_1` FOREIGN KEY (`taxonomiaID`) REFERENCES `taxonomia` (`taxonomiaID`);

--
-- Constraints for table `noticia`
--
ALTER TABLE `noticia`
  ADD CONSTRAINT `noticia_ibfk_1` FOREIGN KEY (`informacionID`) REFERENCES `informacion` (`informacionID`);

--
-- Constraints for table `tips`
--
ALTER TABLE `tips`
  ADD CONSTRAINT `tips_ibfk_1` FOREIGN KEY (`informacionID`) REFERENCES `informacion` (`informacionID`);

--
-- Constraints for table `usuario`
--
ALTER TABLE `usuario`
  ADD CONSTRAINT `usuario_ibfk_1` FOREIGN KEY (`regionID`) REFERENCES `region` (`regionID`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
