-- phpMyAdmin SQL Dump
-- version 4.5.1
-- http://www.phpmyadmin.net
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 28-04-2017 a las 12:31:07
-- Versión del servidor: 10.1.16-MariaDB
-- Versión de PHP: 5.6.24

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `3ebal_hollywood`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `actor`
--

CREATE TABLE `actor` (
  `actor_id` smallint(5) UNSIGNED NOT NULL,
  `first_name` varchar(45) NOT NULL,
  `last_name` varchar(45) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Volcado de datos para la tabla `actor`
--

INSERT INTO `actor` (`actor_id`, `first_name`, `last_name`) VALUES
(1, 'PENELOPE', 'GUINESS'),
(2, 'NICK', 'WAHLBERG'),
(3, 'ED', 'CHASE'),
(4, 'JENNIFER', 'DAVIS'),
(5, 'JOHNNY', 'LOLLOBRIGIDA'),
(6, 'BETTE', 'NICHOLSON'),
(7, 'GRACE', 'MOSTEL'),
(8, 'MATTHEW', 'JOHANSSON'),
(9, 'JOE', 'SWANK'),
(10, 'CHRISTIAN', 'GABLE'),
(11, 'ZERO', 'CAGE'),
(12, 'KARL', 'BERRY'),
(13, 'UMA', 'WOOD'),
(14, 'VIVIEN', 'BERGEN'),
(15, 'CUBA', 'OLIVIER'),
(16, 'FRED', 'COSTNER'),
(17, 'HELEN', 'VOIGHT'),
(18, 'DAN', 'TORN'),
(19, 'BOB', 'FAWCETT'),
(20, 'LUCILLE', 'TRACY'),
(21, 'KIRSTEN', 'PALTROW'),
(22, 'ELVIS', 'MARX'),
(23, 'SANDRA', 'KILMER'),
(24, 'CAMERON', 'STREEP'),
(25, 'asdf', 'aaaa'),
(26, 'aaaa', 'aaaa'),
(27, 'bbbb', 'bbbb');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `film`
--

CREATE TABLE `film` (
  `film_id` smallint(5) UNSIGNED NOT NULL,
  `title` varchar(255) NOT NULL,
  `description` text,
  `release_year` int(4) DEFAULT NULL,
  `language_id` tinyint(3) UNSIGNED NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Volcado de datos para la tabla `film`
--

INSERT INTO `film` (`film_id`, `title`, `description`, `release_year`, `language_id`) VALUES
(1, 'ACADEMY DINOSAUR', 'A Epic Drama of a Feminist And a Mad Scientist who must Battle a Teacher in The Canadian Rockies', 2006, 1),
(2, 'ACE GOLDFINGER', 'A Astounding Epistle of a Database Administrator And a Explorer who must Find a Car in Ancient China', 2006, 1),
(3, 'ADAPTATION HOLES', 'A Astounding Reflection of a Lumberjack And a Car who must Sink a Lumberjack in A Baloon Factory', 2006, 1),
(4, 'AFFAIR PREJUDICE', 'A Fanciful Documentary of a Frisbee And a Lumberjack who must Chase a Monkey in A Shark Tank', 2006, 1),
(5, 'AFRICAN EGG', 'A Fast-Paced Documentary of a Pastry Chef And a Dentist who must Pursue a Forensic Psychologist in The Gulf of Mexico', 2006, 1),
(6, 'AGENT TRUMAN', 'A Intrepid Panorama of a Robot And a Boy who must Escape a Sumo Wrestler in Ancient China', 2006, 1),
(7, 'AIRPLANE SIERRA', 'A Touching Saga of a Hunter And a Butler who must Discover a Butler in A Jet Boat', 2006, 1),
(8, 'AIRPORT POLLOCK', 'A Epic Tale of a Moose And a Girl who must Confront a Monkey in Ancient India', 2006, 1),
(9, 'ALABAMA DEVIL', 'A Thoughtful Panorama of a Database Administrator And a Mad Scientist who must Outgun a Mad Scientist in A Jet Boat', 2006, 1),
(10, 'ALADDIN CALENDAR', 'A Action-Packed Tale of a Man And a Lumberjack who must Reach a Feminist in Ancient China', 2006, 1),
(11, 'ALAMO VIDEOTAPE', 'A Boring Epistle of a Butler And a Cat who must Fight a Pastry Chef in A MySQL Convention', 2006, 1),
(12, 'ALASKA PHANTOM', 'A Fanciful Saga of a Hunter And a Pastry Chef who must Vanquish a Boy in Australia', 2006, 1),
(13, 'ALI FOREVER', 'A Action-Packed Drama of a Dentist And a Crocodile who must Battle a Feminist in The Canadian Rockies', 2006, 1),
(14, 'ALICE FANTASIA', 'A Emotional Drama of a A Shark And a Database Administrator who must Vanquish a Pioneer in Soviet Georgia', 2006, 1),
(15, 'ALIEN CENTER', 'A Brilliant Drama of a Cat And a Mad Scientist who must Battle a Feminist in A MySQL Convention', 2006, 1),
(16, 'ALLEY EVOLUTION', 'A Fast-Paced Drama of a Robot And a Composer who must Battle a Astronaut in New Orleans', 2006, 1),
(17, 'ALONE TRIP', 'A Fast-Paced Character Study of a Composer And a Dog who must Outgun a Boat in An Abandoned Fun House', 2006, 1),
(18, 'ALTER VICTORY', 'A Thoughtful Drama of a Composer And a Feminist who must Meet a Secret Agent in The Canadian Rockies', 2006, 1),
(19, 'AMADEUS HOLY', 'A Emotional Display of a Pioneer And a Technical Writer who must Battle a Man in A Baloon', 2006, 1),
(20, 'AMELIE HELLFIGHTERS', 'A Boring Drama of a Woman And a Squirrel who must Conquer a Student in A Baloon', 2006, 1),
(21, 'AMERICAN CIRCUS', 'A Insightful Drama of a Girl And a Astronaut who must Face a Database Administrator in A Shark Tank', 2006, 1),
(22, 'AMISTAD MIDSUMMER', 'A Emotional Character Study of a Dentist And a Crocodile who must Meet a Sumo Wrestler in California', 2006, 1),
(23, 'ANACONDA CONFESSIONS', 'A Lacklusture Display of a Dentist And a Dentist who must Fight a Girl in Australia', 2006, 1),
(24, 'ANALYZE HOOSIERS', 'A Thoughtful Display of a Explorer And a Pastry Chef who must Overcome a Feminist in The Sahara Desert', 2006, 1),
(25, 'ANGELS LIFE', 'A Thoughtful Display of a Woman And a Astronaut who must Battle a Robot in Berlin', 2006, 1),
(26, 'ANNIE IDENTITY', 'A Amazing Panorama of a Pastry Chef And a Boat who must Escape a Woman in An Abandoned Amusement Park', 2006, 1),
(27, 'ANONYMOUS HUMAN', 'A Amazing Reflection of a Database Administrator And a Astronaut who must Outrace a Database Administrator in A Shark Tank', 2006, 1),
(28, 'ANTHEM LUKE', 'A Touching Panorama of a Waitress And a Woman who must Outrace a Dog in An Abandoned Amusement Park', 2006, 1),
(29, 'ANTITRUST TOMATOES', 'A Fateful Yarn of a Womanizer And a Feminist who must Succumb a Database Administrator in Ancient India', 2006, 1),
(30, 'ANYTHING SAVANNAH', 'A Epic Story of a Pastry Chef And a Woman who must Chase a Feminist in An Abandoned Fun House', 2006, 1),
(31, 'APACHE DIVINE', 'A Awe-Inspiring Reflection of a Pastry Chef And a Teacher who must Overcome a Sumo Wrestler in A U-Boat', 2006, 1),
(32, 'APOCALYPSE FLAMINGOS', 'A Astounding Story of a Dog And a Squirrel who must Defeat a Woman in An Abandoned Amusement Park', 2006, 1),
(33, 'APOLLO TEEN', 'A Action-Packed Reflection of a Crocodile And a Explorer who must Find a Sumo Wrestler in An Abandoned Mine Shaft', 2006, 1),
(34, 'ARABIA DOGMA', 'A Touching Epistle of a Madman And a Mad Cow who must Defeat a Student in Nigeria', 2006, 1),
(35, 'ARACHNOPHOBIA ROLLERCOASTER', 'A Action-Packed Reflection of a Pastry Chef And a Composer who must Discover a Mad Scientist in The First Manned Space Station', 2006, 1),
(36, 'ARGONAUTS TOWN', 'A Emotional Epistle of a Forensic Psychologist And a Butler who must Challenge a Waitress in An Abandoned Mine Shaft', 2006, 1),
(37, 'ARIZONA BANG', 'A Brilliant Panorama of a Mad Scientist And a Mad Cow who must Meet a Pioneer in A Monastery', 2006, 1),
(38, 'ARK RIDGEMONT', 'A Beautiful Yarn of a Pioneer And a Monkey who must Pursue a Explorer in The Sahara Desert', 2006, 1),
(39, 'ARMAGEDDON LOST', 'A Fast-Paced Tale of a Boat And a Teacher who must Succumb a Composer in An Abandoned Mine Shaft', 2006, 1),
(40, 'ARMY FLINTSTONES', 'A Boring Saga of a Database Administrator And a Womanizer who must Battle a Waitress in Nigeria', 2006, 1),
(41, 'ARSENIC INDEPENDENCE', 'A Fanciful Documentary of a Mad Cow And a Womanizer who must Find a Dentist in Berlin', 2006, 1),
(42, 'ARTIST COLDBLOODED', 'A Stunning Reflection of a Robot And a Moose who must Challenge a Woman in California', 2006, 1),
(43, 'ATLANTIS CAUSE', 'A Thrilling Yarn of a Feminist And a Hunter who must Fight a Technical Writer in A Shark Tank', 2006, 1),
(44, 'ATTACKS HATE', 'A Fast-Paced Panorama of a Technical Writer And a Mad Scientist who must Find a Feminist in An Abandoned Mine Shaft', 2006, 1),
(45, 'ATTRACTION NEWTON', 'A Astounding Panorama of a Composer And a Frisbee who must Reach a Husband in Ancient Japan', 2006, 1),
(46, 'AUTUMN CROW', 'A Beautiful Tale of a Dentist And a Mad Cow who must Battle a Moose in The Sahara Desert', 2006, 1),
(47, 'BABY HALL', 'A Boring Character Study of a A Shark And a Girl who must Outrace a Feminist in An Abandoned Mine Shaft', 2006, 1),
(48, 'BACKLASH UNDEFEATED', 'A Stunning Character Study of a Mad Scientist And a Mad Cow who must Kill a Car in A Monastery', 2006, 1),
(49, 'BADMAN DAWN', 'A Emotional Panorama of a Pioneer And a Composer who must Escape a Mad Scientist in A Jet Boat', 2006, 1),
(50, 'BAKED CLEOPATRA', 'A Stunning Drama of a Forensic Psychologist And a Husband who must Overcome a Waitress in A Monastery', 2006, 1);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `film_actor`
--

CREATE TABLE `film_actor` (
  `actor_id` smallint(5) UNSIGNED NOT NULL,
  `film_id` smallint(5) UNSIGNED NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Volcado de datos para la tabla `film_actor`
--

INSERT INTO `film_actor` (`actor_id`, `film_id`) VALUES
(1, 1),
(1, 23),
(1, 25),
(2, 3),
(2, 31),
(2, 47),
(3, 17),
(3, 40),
(3, 42),
(4, 23),
(4, 25),
(5, 19),
(6, 29),
(7, 25),
(7, 27),
(7, 35),
(8, 47),
(9, 30),
(10, 1),
(10, 9),
(12, 16),
(12, 17),
(12, 34),
(12, 37),
(13, 17),
(13, 29),
(13, 45);

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `actor`
--
ALTER TABLE `actor`
  ADD PRIMARY KEY (`actor_id`);

--
-- Indices de la tabla `film`
--
ALTER TABLE `film`
  ADD PRIMARY KEY (`film_id`);

--
-- Indices de la tabla `film_actor`
--
ALTER TABLE `film_actor`
  ADD PRIMARY KEY (`actor_id`,`film_id`),
  ADD KEY `fk_film_actor_film` (`film_id`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `actor`
--
ALTER TABLE `actor`
  MODIFY `actor_id` smallint(5) UNSIGNED NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=28;
--
-- AUTO_INCREMENT de la tabla `film`
--
ALTER TABLE `film`
  MODIFY `film_id` smallint(5) UNSIGNED NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=51;
--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `film_actor`
--
ALTER TABLE `film_actor`
  ADD CONSTRAINT `fk_film_actor_actor` FOREIGN KEY (`actor_id`) REFERENCES `actor` (`actor_id`) ON UPDATE CASCADE,
  ADD CONSTRAINT `fk_film_actor_film` FOREIGN KEY (`film_id`) REFERENCES `film` (`film_id`) ON UPDATE CASCADE;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
