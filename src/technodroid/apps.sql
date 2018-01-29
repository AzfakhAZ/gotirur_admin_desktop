-- phpMyAdmin SQL Dump
-- version 4.1.14
-- http://www.phpmyadmin.net
--
-- Host: 127.0.0.1
-- Generation Time: Jan 28, 2018 at 05:05 PM
-- Server version: 5.6.17
-- PHP Version: 5.5.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Database: `apps`
--

-- --------------------------------------------------------

--
-- Table structure for table `bill`
--

CREATE TABLE IF NOT EXISTS `bill` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `date` varchar(50) NOT NULL,
  `custemername` varchar(50) NOT NULL,
  `contactno` varchar(50) NOT NULL,
  `gstno` varchar(50) NOT NULL,
  `service` varchar(50) NOT NULL,
  `productname` varchar(50) NOT NULL,
  `quantity` int(11) NOT NULL,
  `tax` varchar(10) NOT NULL,
  `price` float NOT NULL,
  `billtype` varchar(50) NOT NULL,
  `billno` int(11) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=22 ;

--
-- Dumping data for table `bill`
--

INSERT INTO `bill` (`id`, `date`, `custemername`, `contactno`, `gstno`, `service`, `productname`, `quantity`, `tax`, `price`, `billtype`, `billno`) VALUES
(1, 'MMM d, yyyy', 'v', '65', '145', '', 'processor,intel,13 4th generation', 5, '24%', 12000, 'Cash Bill', 0),
(2, 'Thu Jan 18 19:30:47 IST 2018', 'c', 'b', '7', 'c', '', 0, '', 5, 'Cash Bill', 0),
(3, 'Fri Jan 05 19:31:20 IST 2018', 'v', 'b', 'y', '', 'processor,intel,13 4th generation', 5, '24%', 12000, 'Cash Bill', 0),
(4, 'Sun Jan 28 20:20:56 IST 2018', 'fghjj', '55886', 'fhju255', '', 'processor,intel,13 4th generation', 2, '24%', 12000, 'Credit Bill', 0),
(6, 'Sun Jan 28 20:23:19 IST 2018', 'asf', '558', 'hjko55', '', 'processor,intel,13 4th generation', 2, '24%', 12000, 'Credit Bill', 0),
(7, 'Sun Jan 28 20:26:19 IST 2018', 'njgf', 'gdg', 'ghrjj', '', 'processor,intel,13 4th generation', 2, '24%', 12000, 'Cash Bill', 0),
(8, 'Sun Jan 28 20:27:01 IST 2018', 'gdfjs', 'hjiu', 'mnn', '', 'ram,zion,2gb', 2, '24%', 2000, 'Cash Bill', 0),
(9, 'Sun Jan 28 20:28:50 IST 2018', 'gfdhj', 'hggfh', 'bbjfgj', '', 'ram,zion,2gb', 1, '24%', 2000, 'Cash Bill', 0),
(10, 'Sun Jan 28 20:32:11 IST 2018', 'hfhgjf', 'dsh', 'hhtu', '', 'ram,zion,2gb', 2, '24%', 2000, 'Cash Bill', 0),
(12, 'Sun Jan 28 20:33:31 IST 2018', 'hfj', 'bbdsh', 'bhhf', '', 'processor,intel,13 4th generation', 2, '24%', 12000, 'Credit Bill', 0),
(13, 'Sun Jan 28 20:34:31 IST 2018', 'fgj', 'hfjh', 'jhj', '', 'ram,zion,2gb', 2, '24%', 2000, 'Credit Bill', 0),
(15, 'Sun Jan 28 20:51:29 IST 2018', 'gdsj', 'hshruu', 'yeuu', '', 'processor,intel,13 4th generation', 2, '24%', 12000, 'Credit Bill', 0),
(18, 'Fri Jan 05 20:58:08 IST 2018', 'tryt', 'gtyt', 'yuy', '', 'processor,intel,13 4th generation', 1, '24%', 12000, 'Cash Bill', 0),
(20, 'Fri Jan 12 21:01:39 IST 2018', 'm', 'gfgeh', 'ghh', '', 'processor,intel,13 4th generation', 1, '24%', 12000, 'Credit Bill', 1),
(21, 'Fri Jan 12 21:01:39 IST 2018', 'm', 'gfgeh', 'ghh', '', 'ram,zion,2gb', 5, '24%', 2000, 'Credit Bill', 1);

-- --------------------------------------------------------

--
-- Table structure for table `category`
--

CREATE TABLE IF NOT EXISTS `category` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `computer` varchar(50) NOT NULL,
  `electronics` varchar(50) NOT NULL,
  `food` varchar(50) NOT NULL,
  `mobile` varchar(50) NOT NULL,
  `printer` varchar(50) NOT NULL,
  `scanner` varchar(50) NOT NULL,
  `camara` varchar(50) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1 AUTO_INCREMENT=1 ;

-- --------------------------------------------------------

--
-- Table structure for table `expence`
--

CREATE TABLE IF NOT EXISTS `expence` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `person` varchar(50) NOT NULL,
  `date` date NOT NULL,
  `details` varchar(50) NOT NULL,
  `amount` float NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=3 ;

--
-- Dumping data for table `expence`
--

INSERT INTO `expence` (`id`, `person`, `date`, `details`, `amount`) VALUES
(1, 'azfakh', '2018-01-27', 'fuevel', 100),
(2, 'aflah', '2018-01-26', 'food', 50);

-- --------------------------------------------------------

--
-- Table structure for table `gst`
--

CREATE TABLE IF NOT EXISTS `gst` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `category` varchar(50) NOT NULL,
  `percentage` double NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=3 ;

--
-- Dumping data for table `gst`
--

INSERT INTO `gst` (`id`, `category`, `percentage`) VALUES
(1, 'computer', 24),
(2, 'electronics', 28);

-- --------------------------------------------------------

--
-- Table structure for table `insert`
--

CREATE TABLE IF NOT EXISTS `insert` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `date` date DEFAULT NULL,
  `sino` bigint(20) DEFAULT NULL,
  `productname` varchar(50) DEFAULT NULL,
  `description` varchar(200) DEFAULT NULL,
  `price` float DEFAULT NULL,
  `stock` bigint(20) DEFAULT NULL,
  `image` varchar(100) NOT NULL,
  `gstcategory` varchar(30) NOT NULL,
  `gstvalue` varchar(50) NOT NULL,
  `category` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=3 ;

--
-- Dumping data for table `insert`
--

INSERT INTO `insert` (`id`, `date`, `sino`, `productname`, `description`, `price`, `stock`, `image`, `gstcategory`, `gstvalue`, `category`) VALUES
(1, '2018-01-27', NULL, 'processor,intel,13 4th generation', '3.5 ghz', 12000, 6, 'processor,intel,13 4th generation.jpg', 'computer', '24%', 'computer'),
(2, '2018-01-28', NULL, 'ram,zion,2gb', 'tec', 2000, 5, 'ram,zion,2gb.jpg', 'computer', '24%', 'computer');

-- --------------------------------------------------------

--
-- Table structure for table `login`
--

CREATE TABLE IF NOT EXISTS `login` (
  `username` varchar(50) NOT NULL,
  `password` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `login`
--

INSERT INTO `login` (`username`, `password`) VALUES
('admin', 'admin@123');

-- --------------------------------------------------------

--
-- Table structure for table `service`
--

CREATE TABLE IF NOT EXISTS `service` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `person1` varchar(30) NOT NULL,
  `person2` varchar(30) NOT NULL,
  `person` varchar(30) NOT NULL,
  `billno` int(11) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1 AUTO_INCREMENT=1 ;

-- --------------------------------------------------------

--
-- Table structure for table `staff`
--

CREATE TABLE IF NOT EXISTS `staff` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(50) NOT NULL,
  `address` varchar(100) NOT NULL,
  `image` varchar(50) NOT NULL,
  `resume` varchar(50) NOT NULL,
  `contactno` varchar(50) NOT NULL,
  `email` varchar(50) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=4 ;

--
-- Dumping data for table `staff`
--

INSERT INTO `staff` (`id`, `name`, `address`, `image`, `resume`, `contactno`, `email`) VALUES
(1, 'azfakh', 'thekkayil', 'azfakh.jpg', 'file', '9072071405', 'azfakht@gmail.com'),
(2, 'aflah', 'dfhjfkgll', 'aflah.jpg', 'fjdjl', '3564895655', 'lahvp@gmail.comaf'),
(3, 'dilshad', 'thegskd', 'dilshad.jpg', 'sfch', '688549855', 'dillu@gmail.com');

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
