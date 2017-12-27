-- phpMyAdmin SQL Dump
-- version 4.5.1
-- http://www.phpmyadmin.net
--
-- Host: 127.0.0.1
-- Generation Time: Apr 06, 2016 at 05:36 AM
-- Server version: 10.1.10-MariaDB
-- PHP Version: 5.6.19

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `eventplanner`
--

-- --------------------------------------------------------

--
-- Table structure for table `artistsdetails`
--

CREATE TABLE `artistsdetails` (
  `arID` int(10) NOT NULL,
  `ar_name` varchar(50) NOT NULL,
  `ar_phone` int(10) NOT NULL,
  `ar_email` varchar(50) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `artistsdetails`
--

INSERT INTO `artistsdetails` (`arID`, `ar_name`, `ar_phone`, `ar_email`) VALUES
(1, 'Kasun Kalhara', 123654789, 'kasun@kasun.com'),
(2, 'Indrachapa Liyanage', 718964320, 'test@tas.com'),
(3, 'Indracahapa Liayanage', 123654987, 'test@asda'),
(4, 'Nemesis', 321456789, 'nem@te.com'),
(5, 'test', 771943040, 'test@f');

-- --------------------------------------------------------

--
-- Table structure for table `caterdetails`
--

CREATE TABLE `caterdetails` (
  `caterID` int(10) NOT NULL,
  `caterName` varchar(50) NOT NULL,
  `caterAddress` varchar(50) NOT NULL,
  `caterEmail` varchar(50) DEFAULT NULL,
  `caterTP` int(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `caterdetails`
--

INSERT INTO `caterdetails` (`caterID`, `caterName`, `caterAddress`, `caterEmail`, `caterTP`) VALUES
(1, 'PizzaHut', 'test, Colombo', 'info@pizzaHut.lk', 123456789),
(2, 'KFC', 'Galle', 'test@ga', 321654987),
(3, 'Big Bite', ' Colombo', 'teatas', 321654987),
(4, 'McDonalds', 'Maharagama', 'info@mcdonald.com', 123654789),
(5, 'Grand Monarch Cater', 'Thalawathugoda', 'info@gmc.com', 321654987),
(6, 'MR. Chicko Texas', 'Nugegoda', 'info@test.com', 117986410);

-- --------------------------------------------------------

--
-- Table structure for table `decodetails`
--

CREATE TABLE `decodetails` (
  `decoID` int(10) NOT NULL,
  `decoName` varchar(50) NOT NULL,
  `decoAddress` varchar(50) NOT NULL,
  `decoEmail` varchar(50) DEFAULT NULL,
  `decoTP` int(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `decodetails`
--

INSERT INTO `decodetails` (`decoID`, `decoName`, `decoAddress`, `decoEmail`, `decoTP`) VALUES
(1, 'Flora', 'test', 'test', 147852369),
(2, 'Deco Star', 'Maharagama', 'info.deco@deco.com', 771943040);

-- --------------------------------------------------------

--
-- Table structure for table `eventartists`
--

CREATE TABLE `eventartists` (
  `eventID` int(10) NOT NULL,
  `arID` int(10) NOT NULL,
  `transportSupply` tinyint(1) NOT NULL,
  `instrumentSupply` tinyint(1) NOT NULL,
  `genre` varchar(50) NOT NULL,
  `numOfhours` double NOT NULL,
  `numOfmembers` int(10) NOT NULL,
  `avgCost` double NOT NULL,
  `spclNote` text NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `eventartists`
--

INSERT INTO `eventartists` (`eventID`, `arID`, `transportSupply`, `instrumentSupply`, `genre`, `numOfhours`, `numOfmembers`, `avgCost`, `spclNote`) VALUES
(62, 2, 1, 0, 'Alternative Music', 0.5, 10, 32, 'et'),
(106, 4, 1, 0, 'Rock', 2, 3, 20000, '');

-- --------------------------------------------------------

--
-- Table structure for table `eventcater`
--

CREATE TABLE `eventcater` (
  `eventID` int(11) NOT NULL,
  `caterID` int(11) NOT NULL,
  `typeOfMeal` text NOT NULL,
  `breakfast` tinyint(1) DEFAULT NULL,
  `lunch` tinyint(1) DEFAULT NULL,
  `dinner` tinyint(1) DEFAULT NULL,
  `evngTea` tinyint(1) DEFAULT NULL,
  `cocktail` tinyint(1) DEFAULT NULL,
  `avgPrice` double NOT NULL,
  `spclNote` text
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `eventcater`
--

INSERT INTO `eventcater` (`eventID`, `caterID`, `typeOfMeal`, `breakfast`, `lunch`, `dinner`, `evngTea`, `cocktail`, `avgPrice`, `spclNote`) VALUES
(62, 4, 'Family Style', 0, 1, 0, 0, 0, 950, 'test'),
(71, 3, 'Buffet', 1, 0, 0, 0, 0, 3200, 'test'),
(79, 4, 'Buffet', 1, 1, 0, 0, 1, 1250, 'tet'),
(88, 2, 'Sit-Down/Served', 1, 1, 0, 0, 0, 12, 'test'),
(106, 6, 'Family Style', 0, 1, 0, 0, 0, 500, '');

-- --------------------------------------------------------

--
-- Table structure for table `eventdeco`
--

CREATE TABLE `eventdeco` (
  `eventID` int(10) NOT NULL,
  `decoID` int(10) NOT NULL,
  `flowers` tinyint(1) DEFAULT NULL,
  `candles` tinyint(1) DEFAULT NULL,
  `balloons` tinyint(1) DEFAULT NULL,
  `ornemants` tinyint(1) DEFAULT NULL,
  `lights` tinyint(1) DEFAULT NULL,
  `avgCost` double NOT NULL,
  `spclNote` text
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `eventdeco`
--

INSERT INTO `eventdeco` (`eventID`, `decoID`, `flowers`, `candles`, `balloons`, `ornemants`, `lights`, `avgCost`, `spclNote`) VALUES
(62, 1, 1, 0, 0, 0, 0, 6500, ''),
(106, 2, 1, 1, 0, 0, 0, 1250, '');

-- --------------------------------------------------------

--
-- Table structure for table `eventdetails`
--

CREATE TABLE `eventdetails` (
  `eventID` int(10) NOT NULL,
  `eventName` varchar(50) NOT NULL,
  `eventType` text NOT NULL,
  `eventStartDate` date NOT NULL,
  `eventEndDate` date NOT NULL,
  `eventStartTime` varchar(50) NOT NULL,
  `eventEndTime` varchar(50) NOT NULL,
  `eventAvgNumPrsn` int(50) NOT NULL,
  `eventSpclNte` text
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `eventdetails`
--

INSERT INTO `eventdetails` (`eventID`, `eventName`, `eventType`, `eventStartDate`, `eventEndDate`, `eventStartTime`, `eventEndTime`, `eventAvgNumPrsn`, `eventSpclNte`) VALUES
(62, 'test BirthDay', 'Birthady', '2016-04-05', '2016-04-05', 'Thu Jan 01 19:00:00 IST 1970', 'Fri Jan 02 03:00:00 IST 1970', 20, ''),
(68, 'test', 'Meeting', '2016-04-10', '2016-04-10', 'Sun Apr 03 12:49:37 IST 2016', 'Sun Apr 03 12:49:37 IST 2016', 12, 'test'),
(71, 'test', 'Sport Event', '2016-04-10', '2016-04-10', 'Sun Apr 03 13:12:41 IST 2016', 'Sun Apr 03 13:12:41 IST 2016', 12, ''),
(72, 'test', 'Sport Event', '2016-04-10', '2016-04-10', 'Sun Apr 03 14:05:21 IST 2016', 'Sun Apr 03 14:05:21 IST 2016', 123, 'test'),
(75, 'test timeline', 'Dinner Party', '2016-04-10', '2016-04-10', 'Sun Apr 03 14:15:26 IST 2016', 'Sun Apr 03 14:15:26 IST 2016', 122, 'test'),
(79, 'test', 'Meeting', '2016-04-03', '2016-04-03', 'Sun Apr 03 18:22:04 IST 2016', 'Sun Apr 03 18:22:04 IST 2016', 12, ''),
(80, 'test', 'Birthady', '2016-04-03', '2016-04-03', 'Sun Apr 03 18:43:08 IST 2016', 'Sun Apr 03 18:43:08 IST 2016', 12, ''),
(81, 'test', 'Seminar', '2016-04-10', '2016-04-10', 'Sun Apr 03 18:56:15 IST 2016', 'Sun Apr 03 18:56:15 IST 2016', 23, 'test'),
(82, 'test Time Line', 'Dinner Party', '2016-04-03', '2016-04-03', 'Sun Apr 03 19:09:22 IST 2016', 'Sun Apr 03 19:09:22 IST 2016', 100, 'test'),
(83, 'test', 'Meeting', '2016-04-03', '2016-04-03', 'Sun Apr 03 19:12:10 IST 2016', 'Sun Apr 03 19:12:10 IST 2016', 12, ''),
(84, 'test', 'Dinner Party', '2016-04-03', '2016-04-03', 'Sun Apr 03 19:14:40 IST 2016', 'Sun Apr 03 19:14:40 IST 2016', 12, ''),
(86, 'test', 'Meeting', '2016-04-03', '2016-04-03', 'Sun Apr 03 19:25:53 IST 2016', 'Sun Apr 03 19:25:53 IST 2016', 12, ''),
(87, 'test', 'Meeting', '2016-04-03', '2016-04-03', 'Sun Apr 03 21:21:26 IST 2016', 'Sun Apr 03 21:21:26 IST 2016', 12, ''),
(88, 'test', 'Seminar', '2016-04-08', '2016-04-08', 'Sun Apr 03 21:28:44 IST 2016', 'Sun Apr 03 21:28:44 IST 2016', 432, 'test'),
(89, 'Dhanuka s Birthday', 'Birthday', '2016-06-16', '2016-06-16', 'Thu Jan 01 17:00:00 IST 1970', 'Thu Jan 01 23:59:00 IST 1970', 25, ''),
(90, 'test', 'Birthday', '2016-04-03', '2016-04-03', 'Sun Apr 03 21:36:59 IST 2016', 'Sun Apr 03 21:36:59 IST 2016', 10, 'test'),
(92, 'test', 'Meeting', '2016-04-03', '2016-04-03', 'Sun Apr 03 22:11:17 IST 2016', 'Sun Apr 03 22:11:17 IST 2016', 12, ''),
(93, 'test', 'Seminar', '2016-04-05', '2016-04-05', 'Tue Apr 05 15:19:05 IST 2016', 'Tue Apr 05 15:19:05 IST 2016', 10, ''),
(94, 'test rreoprt', 'Dinner Party', '2016-04-02', '2016-04-02', 'Tue Apr 05 15:24:37 IST 2016', 'Tue Apr 05 15:24:37 IST 2016', 12, ''),
(95, 'test', 'Dinner Party', '2016-04-03', '2016-04-03', 'Tue Apr 05 15:27:59 IST 2016', 'Tue Apr 05 15:27:59 IST 2016', 12, ''),
(96, 'test', 'Birthday', '2016-04-06', '2016-04-06', 'Tue Apr 05 15:32:33 IST 2016', 'Tue Apr 05 15:32:33 IST 2016', 12, ''),
(97, 'test', 'Meeting', '2016-04-11', '2016-04-11', 'Tue Apr 05 15:40:43 IST 2016', 'Tue Apr 05 15:40:43 IST 2016', 212, ''),
(98, 'test 12', 'Meeting', '2016-04-15', '2016-04-15', 'Tue Apr 05 16:01:43 IST 2016', 'Tue Apr 05 16:01:43 IST 2016', 12, ''),
(99, 'test', 'Seminar', '2016-04-06', '2016-04-06', 'Tue Apr 05 16:03:53 IST 2016', 'Tue Apr 05 16:03:53 IST 2016', 12, '12'),
(100, 'test', 'Seminar', '2016-04-13', '2016-04-13', 'Tue Apr 05 16:08:12 IST 2016', 'Tue Apr 05 16:08:12 IST 2016', 12, 'test'),
(101, 'test', 'Seminar', '2016-04-16', '2016-04-16', 'Tue Apr 05 16:09:32 IST 2016', 'Tue Apr 05 16:09:32 IST 2016', 12, 'test'),
(102, 'test', 'Meeting', '2016-04-21', '2016-04-21', 'Tue Apr 05 16:11:29 IST 2016', 'Tue Apr 05 16:11:29 IST 2016', 12, 'tes'),
(103, 'test timre report', 'Birthday', '2016-04-30', '2016-04-30', 'Tue Apr 05 16:15:26 IST 2016', 'Tue Apr 05 16:15:26 IST 2016', 12, 'te'),
(104, 'rep', 'Meeting', '2016-04-05', '2016-04-05', 'Tue Apr 05 16:16:50 IST 2016', 'Tue Apr 05 16:16:50 IST 2016', 23, 'tes'),
(105, 'test', 'Seminar', '2016-04-03', '2016-04-03', 'Tue Apr 05 21:01:58 IST 2016', 'Tue Apr 05 21:01:58 IST 2016', 43, 'test'),
(106, 'last', 'Seminar', '2016-05-06', '2016-05-06', 'Wed Apr 06 09:00:09 IST 2016', 'Thu Jan 01 12:00:00 IST 1970', 12, '');

-- --------------------------------------------------------

--
-- Table structure for table `eventphotovideo`
--

CREATE TABLE `eventphotovideo` (
  `eventID` int(10) NOT NULL,
  `pvID` int(10) NOT NULL,
  `photo` tinyint(1) NOT NULL,
  `video` tinyint(1) NOT NULL,
  `printedAlbum` tinyint(1) NOT NULL,
  `digitalAlbum` tinyint(1) NOT NULL,
  `numberOfHours` double NOT NULL,
  `avgCost` double NOT NULL,
  `spclNote` text
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `eventphotovideo`
--

INSERT INTO `eventphotovideo` (`eventID`, `pvID`, `photo`, `video`, `printedAlbum`, `digitalAlbum`, `numberOfHours`, `avgCost`, `spclNote`) VALUES
(62, 1, 1, 0, 1, 1, 2.5, 1500, 'test'),
(62, 2, 1, 0, 1, 1, 4, 50, 'test'),
(86, 1, 1, 0, 1, 0, 1, 1233, 'test'),
(86, 2, 1, 1, 1, 1, 1.5, 1232, 'test'),
(106, 2, 1, 0, 0, 1, 3, 20000, 'test');

-- --------------------------------------------------------

--
-- Table structure for table `eventtimeline`
--

CREATE TABLE `eventtimeline` (
  `eventID` int(10) NOT NULL,
  `tLineID` int(10) NOT NULL,
  `task` varchar(50) NOT NULL,
  `startTime` double NOT NULL,
  `endTime` double NOT NULL,
  `SpclNote` text
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `eventtimeline`
--

INSERT INTO `eventtimeline` (`eventID`, `tLineID`, `task`, `startTime`, `endTime`, `SpclNote`) VALUES
(80, 6, 'test', 0.5, 0.5, 'test'),
(82, 7, '1', 0.5, 1.5, ''),
(83, 8, '1', 0.5, 0.5, '2'),
(84, 9, 'test', 0.5, 0.5, '1'),
(86, 11, '1', 1, 1.5, 'w'),
(86, 11, '2', 1.5, 1.5, 'w'),
(86, 11, '3', 2, 2.5, '3as'),
(93, 13, '1 report', 1, 1.5, 'test'),
(93, 13, '2 report', 1.5, 2.5, 'report'),
(94, 14, 'test', 1, 0.5, 'tes'),
(95, 15, '21', 0.5, 0.5, 'es'),
(97, 16, '1', 0.5, 0.5, '2'),
(98, 17, 'tet', 1, 1.5, 'e'),
(99, 18, '42', 1, 1.5, 'we'),
(100, 19, '2', 0.5, 0.5, 't'),
(101, 20, 'e', 0.5, 0.5, 'te'),
(102, 21, 'e', 0.5, 0.5, 'e'),
(103, 22, 'e', 0.5, 0.5, 'e'),
(104, 23, 'e', 0.5, 0.5, 'e'),
(105, 24, '1', 0.5, 0.5, '2');

-- --------------------------------------------------------

--
-- Table structure for table `eventvenue`
--

CREATE TABLE `eventvenue` (
  `eventID` int(10) NOT NULL,
  `venueID` int(10) NOT NULL,
  `avgPrice` int(50) NOT NULL,
  `spclNote` text
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `eventvenue`
--

INSERT INTO `eventvenue` (`eventID`, `venueID`, `avgPrice`, `spclNote`) VALUES
(68, 5, 5000, 'test'),
(88, 2, 123, 'test'),
(106, 1, 15000, 'test');

-- --------------------------------------------------------

--
-- Table structure for table `photovideodetails`
--

CREATE TABLE `photovideodetails` (
  `pvID` int(10) NOT NULL,
  `pvName` varchar(50) NOT NULL,
  `pvPhone` int(10) NOT NULL,
  `pvEmail` varchar(50) DEFAULT NULL,
  `pvAddress` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `photovideodetails`
--

INSERT INTO `photovideodetails` (`pvID`, `pvName`, `pvPhone`, `pvEmail`, `pvAddress`) VALUES
(1, 'Xtreme Youth', 123456789, 'test@faf.com', 'dasdw'),
(2, 'LetKnowMe.lk', 123456789, 'asd@sad.com', 'asd test'),
(3, 'test', 12345, 'test@tes', 'test'),
(4, 'test', 1234, 'test', 'test'),
(5, 'test', 123, '12343@', 'test');

-- --------------------------------------------------------

--
-- Table structure for table `system_login`
--

CREATE TABLE `system_login` (
  `username` varchar(50) NOT NULL,
  `password` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `system_login`
--

INSERT INTO `system_login` (`username`, `password`) VALUES
('test', '12345'),
('test2', '12345');

-- --------------------------------------------------------

--
-- Table structure for table `timelinedetails`
--

CREATE TABLE `timelinedetails` (
  `tLineID` int(10) NOT NULL,
  `tLineName` varchar(250) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `timelinedetails`
--

INSERT INTO `timelinedetails` (`tLineID`, `tLineName`) VALUES
(1, 'test'),
(2, 'test'),
(3, ''),
(4, 'tetst'),
(5, 'test'),
(6, ''),
(7, 'test Time Line'),
(8, 'test'),
(9, 'test'),
(10, 'test'),
(11, 'test'),
(12, 'Dhanuka s Birthday'),
(13, 'test'),
(14, 'test rreoprt'),
(15, 'test'),
(16, 'test'),
(17, 'test 12'),
(18, 'test'),
(19, 'test'),
(20, 'test'),
(21, 'test'),
(22, 'test timre report'),
(23, 'rep'),
(24, 'test');

-- --------------------------------------------------------

--
-- Table structure for table `venuedetails`
--

CREATE TABLE `venuedetails` (
  `venueID` int(10) NOT NULL,
  `venueName` varchar(50) NOT NULL,
  `venueAddress` varchar(50) NOT NULL,
  `venueCity` varchar(50) NOT NULL,
  `venueEmail` varchar(50) DEFAULT NULL,
  `venueTP` varchar(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `venuedetails`
--

INSERT INTO `venuedetails` (`venueID`, `venueName`, `venueAddress`, `venueCity`, `venueEmail`, `venueTP`) VALUES
(1, 'Galadari', 'Colombo, Sri lanka', 'Colombo ', 'galdari@galadari.com', '0123654789'),
(2, 'Sanora', 'Thalawathugoda, Colombo', 'Colombo ', 'sanora@sasd.com', '1234567890'),
(3, 'KFC', 'asd2,dasd\nasd', 'Galle', 'dasd@sd', '1234567891'),
(4, 'Pizza Hut', 'Rajagiriya', 'Colombo', 'info@pizzahut.com', '0112789456'),
(5, 'Grand Monarch 2', 'Thalawathugoda', 'Colombo', 'info@grandmonarch.com', '0771943040'),
(6, 'McDonalds', 'Panniptitya', 'Kandy', 'info@mcdonald.com', '7896541230'),
(7, 'Dominos', 'Maharagama', 'Colombo', 'info@dominos.com', '123456789'),
(8, 'Dominos 2', 'Maharagama', 'Colombo', 'info@dominos.com', '0123654789'),
(9, 'McDonalds', 'Pannipitiya', 'Negambo', 'info@mcdonald.com', '7896541230');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `artistsdetails`
--
ALTER TABLE `artistsdetails`
  ADD PRIMARY KEY (`arID`);

--
-- Indexes for table `caterdetails`
--
ALTER TABLE `caterdetails`
  ADD PRIMARY KEY (`caterID`);

--
-- Indexes for table `decodetails`
--
ALTER TABLE `decodetails`
  ADD PRIMARY KEY (`decoID`);

--
-- Indexes for table `eventartists`
--
ALTER TABLE `eventartists`
  ADD UNIQUE KEY `eventartists_index` (`eventID`,`arID`),
  ADD KEY `event_ar_arID` (`arID`);

--
-- Indexes for table `eventcater`
--
ALTER TABLE `eventcater`
  ADD UNIQUE KEY `eventCaterIndex` (`eventID`,`caterID`),
  ADD KEY `caterID` (`caterID`);

--
-- Indexes for table `eventdeco`
--
ALTER TABLE `eventdeco`
  ADD UNIQUE KEY `eventDecoIndex` (`eventID`,`decoID`),
  ADD KEY `evntDecoDecoID` (`decoID`);

--
-- Indexes for table `eventdetails`
--
ALTER TABLE `eventdetails`
  ADD PRIMARY KEY (`eventID`);

--
-- Indexes for table `eventphotovideo`
--
ALTER TABLE `eventphotovideo`
  ADD UNIQUE KEY `eventPV` (`eventID`,`pvID`),
  ADD KEY `event_pv_pvID` (`pvID`);

--
-- Indexes for table `eventtimeline`
--
ALTER TABLE `eventtimeline`
  ADD UNIQUE KEY `timelineUniqeKey` (`eventID`,`tLineID`,`startTime`),
  ADD KEY `event_timeLine_tLID` (`tLineID`);

--
-- Indexes for table `eventvenue`
--
ALTER TABLE `eventvenue`
  ADD UNIQUE KEY `eventVenueIndex` (`eventID`,`venueID`),
  ADD KEY `venueID` (`venueID`);

--
-- Indexes for table `photovideodetails`
--
ALTER TABLE `photovideodetails`
  ADD PRIMARY KEY (`pvID`);

--
-- Indexes for table `timelinedetails`
--
ALTER TABLE `timelinedetails`
  ADD PRIMARY KEY (`tLineID`);

--
-- Indexes for table `venuedetails`
--
ALTER TABLE `venuedetails`
  ADD PRIMARY KEY (`venueID`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `artistsdetails`
--
ALTER TABLE `artistsdetails`
  MODIFY `arID` int(10) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;
--
-- AUTO_INCREMENT for table `caterdetails`
--
ALTER TABLE `caterdetails`
  MODIFY `caterID` int(10) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=7;
--
-- AUTO_INCREMENT for table `decodetails`
--
ALTER TABLE `decodetails`
  MODIFY `decoID` int(10) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;
--
-- AUTO_INCREMENT for table `eventdetails`
--
ALTER TABLE `eventdetails`
  MODIFY `eventID` int(10) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=107;
--
-- AUTO_INCREMENT for table `photovideodetails`
--
ALTER TABLE `photovideodetails`
  MODIFY `pvID` int(10) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;
--
-- AUTO_INCREMENT for table `timelinedetails`
--
ALTER TABLE `timelinedetails`
  MODIFY `tLineID` int(10) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=25;
--
-- AUTO_INCREMENT for table `venuedetails`
--
ALTER TABLE `venuedetails`
  MODIFY `venueID` int(10) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=10;
--
-- Constraints for dumped tables
--

--
-- Constraints for table `eventartists`
--
ALTER TABLE `eventartists`
  ADD CONSTRAINT `event_ar_arID` FOREIGN KEY (`arID`) REFERENCES `artistsdetails` (`arID`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `event_ar_evntID` FOREIGN KEY (`eventID`) REFERENCES `eventdetails` (`eventID`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Constraints for table `eventcater`
--
ALTER TABLE `eventcater`
  ADD CONSTRAINT `caterID` FOREIGN KEY (`caterID`) REFERENCES `caterdetails` (`caterID`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `evntID` FOREIGN KEY (`eventID`) REFERENCES `eventdetails` (`eventID`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Constraints for table `eventdeco`
--
ALTER TABLE `eventdeco`
  ADD CONSTRAINT `evntDecoDecoID` FOREIGN KEY (`decoID`) REFERENCES `decodetails` (`decoID`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `evntDecoevntID` FOREIGN KEY (`eventID`) REFERENCES `eventdetails` (`eventID`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Constraints for table `eventphotovideo`
--
ALTER TABLE `eventphotovideo`
  ADD CONSTRAINT `event_pv_eventID` FOREIGN KEY (`eventID`) REFERENCES `eventdetails` (`eventID`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `event_pv_pvID` FOREIGN KEY (`pvID`) REFERENCES `photovideodetails` (`pvID`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Constraints for table `eventtimeline`
--
ALTER TABLE `eventtimeline`
  ADD CONSTRAINT `event_timeLine_eventID` FOREIGN KEY (`eventID`) REFERENCES `eventdetails` (`eventID`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `event_timeLine_tLID` FOREIGN KEY (`tLineID`) REFERENCES `timelinedetails` (`tLineID`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Constraints for table `eventvenue`
--
ALTER TABLE `eventvenue`
  ADD CONSTRAINT `eventID` FOREIGN KEY (`eventID`) REFERENCES `eventdetails` (`eventID`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `venueID` FOREIGN KEY (`venueID`) REFERENCES `venuedetails` (`venueID`) ON DELETE CASCADE ON UPDATE CASCADE;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
