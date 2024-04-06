-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Apr 06, 2024 at 02:08 PM
-- Server version: 10.4.32-MariaDB
-- PHP Version: 8.0.30

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `ordering`
--

-- --------------------------------------------------------

--
-- Table structure for table `tbl_customer`
--

CREATE TABLE `tbl_customer` (
  `Customer_ID` int(11) NOT NULL,
  `Customer_Firstname` varchar(255) DEFAULT NULL,
  `Customer_Lastname` varchar(255) DEFAULT NULL,
  `Customer_Middlename` varchar(255) DEFAULT NULL,
  `Gender` char(1) DEFAULT NULL,
  `Address` text DEFAULT NULL,
  `Email` varchar(255) DEFAULT NULL,
  `Password` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `tbl_customer`
--

INSERT INTO `tbl_customer` (`Customer_ID`, `Customer_Firstname`, `Customer_Lastname`, `Customer_Middlename`, `Gender`, `Address`, `Email`, `Password`) VALUES
(1, 'adsdad', 'dww', 'dddwdw', 'F', 'ewfwerwfwe', 'fwwqw@adadwa.com', '123'),
(3, 'test2', 'test', 'test', 'F', 'test', 'test@', 'test'),
(5, 'Anven Moses', 'Agbulos', 'Lompon', 'M', 'Lower Sosohon', 'anven@gmail.com', 'skirty'),
(6, 'Wyne Khristian', 'Ipanag', 'Bulan', 'M', 'Miranda', 'ipanagwewen@gmail.com', 'mariaisabella'),
(7, 'Super', 'Nanan', '', 'M', 'San Miguel', 'nananqt@gmail.com', 'nanan'),
(8, 'Je-al ', 'Labarro', 'labadan', 'M', 'San Miguel', 'ohmyjeallabs@gmail.com', 'jeal123'),
(9, 'Sharamary', 'Agbulos', 'Lompon', 'F', 'Lower Sosohon Tankulan Manolo Fortich', 'shara@gmail.com', 'shara123'),
(10, 'James Rymarc', 'Bagasbas', '', 'M', 'Dalirig', 'rymarc@gmail.com', 'rymarc123'),
(11, 'Dariel', 'Jenisan', 'S.', 'M', 'Sankanan Manolo Fortich Bukidnon', 'Dariel@gmail.com', 'dariel123');

-- --------------------------------------------------------

--
-- Table structure for table `tbl_product`
--

CREATE TABLE `tbl_product` (
  `Product_ID` int(11) NOT NULL,
  `Product_name` varchar(255) NOT NULL,
  `Product_price` decimal(10,2) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `tbl_product`
--

INSERT INTO `tbl_product` (`Product_ID`, `Product_name`, `Product_price`) VALUES
(1, 'Processor', 6199.00),
(2, 'Motherboard', 4205.00),
(3, 'Graphics Card', 9380.00),
(4, 'Memory', 1049.00),
(5, 'SSD', 2235.00),
(6, 'Power Supply', 1653.00),
(7, 'PC Case', 1445.00),
(8, 'Monitor', 3950.00),
(9, 'Keyboard', 1280.00),
(10, 'Mouse', 245.00),
(11, 'Headset', 789.00),
(12, 'AVR', 275.00);

-- --------------------------------------------------------

--
-- Table structure for table `tbl_transaction`
--

CREATE TABLE `tbl_transaction` (
  `Transaction_ID` int(11) NOT NULL,
  `Customer_ID` int(11) DEFAULT NULL,
  `Product_ID` int(11) DEFAULT NULL,
  `Quantity` int(11) DEFAULT NULL,
  `Total_Price` decimal(10,2) DEFAULT NULL,
  `Transaction_date` timestamp NOT NULL DEFAULT current_timestamp()
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `tbl_transaction`
--

INSERT INTO `tbl_transaction` (`Transaction_ID`, `Customer_ID`, `Product_ID`, `Quantity`, `Total_Price`, `Transaction_date`) VALUES
(1, 5, 12, 1, 275.00, '2023-12-28 12:10:12'),
(2, 5, 11, 1, 789.00, '2023-12-28 12:10:12'),
(3, 5, 10, 2, 490.00, '2023-12-28 12:10:12'),
(4, 5, 9, 1, 1280.00, '2023-12-28 12:10:12'),
(5, 5, 8, 1, 3950.00, '2023-12-28 12:10:12'),
(6, 5, 7, 1, 1445.00, '2023-12-28 12:10:12'),
(7, 5, 6, 1, 1653.00, '2023-12-28 12:10:12'),
(8, 5, 5, 1, 2235.00, '2023-12-28 12:10:12'),
(9, 5, 4, 3, 3147.00, '2023-12-28 12:10:12'),
(10, 5, 3, 1, 9380.00, '2023-12-28 12:10:12'),
(11, 5, 2, 1, 4205.00, '2023-12-28 12:10:12'),
(12, 5, 1, 1, 6199.00, '2023-12-28 12:10:12'),
(13, 5, 12, 1, 275.00, '2023-12-29 08:28:15'),
(14, 5, 11, 1, 789.00, '2023-12-29 08:28:15'),
(15, 5, 10, 1, 245.00, '2023-12-29 08:28:15'),
(16, 5, 9, 1, 1280.00, '2023-12-29 08:28:15'),
(17, 5, 8, 1, 3950.00, '2023-12-29 08:28:15'),
(18, 5, 7, 1, 1445.00, '2023-12-29 08:28:15'),
(19, 5, 6, 1, 1653.00, '2023-12-29 08:28:15'),
(20, 5, 5, 1, 2235.00, '2023-12-29 08:28:15'),
(21, 5, 4, 2, 2098.00, '2023-12-29 08:28:15'),
(22, 5, 3, 1, 9380.00, '2023-12-29 08:28:15'),
(23, 5, 2, 1, 4205.00, '2023-12-29 08:28:15'),
(24, 5, 1, 1, 6199.00, '2023-12-29 08:28:15'),
(25, 5, 12, 1, 275.00, '2023-12-29 08:32:25'),
(26, 5, 11, 1, 789.00, '2023-12-29 08:32:25'),
(27, 5, 10, 1, 245.00, '2023-12-29 08:32:25'),
(28, 5, 9, 1, 1280.00, '2023-12-29 08:32:25'),
(29, 5, 8, 1, 3950.00, '2023-12-29 08:32:25'),
(30, 5, 7, 1, 1445.00, '2023-12-29 08:32:25'),
(31, 5, 6, 1, 1653.00, '2023-12-29 08:32:25'),
(32, 5, 5, 1, 2235.00, '2023-12-29 08:32:25'),
(33, 5, 4, 2, 2098.00, '2023-12-29 08:32:25'),
(34, 5, 3, 1, 9380.00, '2023-12-29 08:32:25'),
(35, 5, 2, 1, 4205.00, '2023-12-29 08:32:25'),
(36, 5, 1, 1, 6199.00, '2023-12-29 08:32:25'),
(37, 8, 3, 1, 9380.00, '2023-12-29 08:37:39'),
(38, 8, 1, 1, 6199.00, '2023-12-29 08:37:39'),
(39, 8, 9, 1, 1280.00, '2023-12-29 08:37:39'),
(40, 8, 8, 1, 3950.00, '2023-12-29 08:37:39'),
(41, 8, 11, 1, 789.00, '2023-12-29 08:37:39'),
(42, 8, 10, 1, 245.00, '2023-12-29 08:40:24'),
(43, 8, 7, 1, 1445.00, '2023-12-29 08:40:24'),
(44, 8, 8, 1, 3950.00, '2023-12-29 08:40:24'),
(45, 5, 2, 3, 12615.00, '2023-12-29 10:34:29'),
(46, 5, 1, 1, 6199.00, '2023-12-29 10:34:29'),
(47, 9, 2, 1, 4205.00, '2023-12-30 06:23:15'),
(48, 9, 3, 1, 9380.00, '2023-12-30 06:23:15'),
(49, 9, 1, 3, 18597.00, '2023-12-30 06:23:15'),
(50, 9, 7, 1, 1445.00, '2023-12-30 06:23:15'),
(51, 9, 8, 1, 3950.00, '2023-12-30 06:23:15'),
(52, 9, 9, 1, 1280.00, '2023-12-30 06:23:15'),
(53, 5, 5, 1, 2235.00, '2023-12-31 04:17:59'),
(54, 5, 4, 2, 2098.00, '2023-12-31 04:17:59'),
(55, 5, 1, 1, 6199.00, '2024-01-04 02:51:17'),
(56, 5, 2, 1, 4205.00, '2024-01-04 02:51:17'),
(57, 10, 4, 1, 1049.00, '2024-01-04 03:35:41'),
(58, 10, 3, 1, 9380.00, '2024-01-04 03:35:41'),
(59, 10, 2, 1, 4205.00, '2024-01-04 03:35:41'),
(60, 10, 1, 1, 6199.00, '2024-01-04 03:35:41'),
(61, 5, 3, 2, 18760.00, '2024-01-04 11:55:50'),
(62, 5, 2, 1, 4205.00, '2024-01-04 11:55:50'),
(63, 5, 1, 1, 6199.00, '2024-01-04 11:55:50'),
(64, 3, 12, 1, 275.00, '2024-04-06 11:54:19'),
(65, 3, 11, 1, 789.00, '2024-04-06 11:54:19'),
(66, 3, 10, 1, 245.00, '2024-04-06 11:54:19'),
(67, 3, 7, 1, 1445.00, '2024-04-06 11:54:19'),
(68, 3, 8, 1, 3950.00, '2024-04-06 11:54:19'),
(69, 3, 9, 1, 1280.00, '2024-04-06 11:54:19'),
(70, 3, 6, 1, 1653.00, '2024-04-06 11:54:19'),
(71, 3, 5, 1, 2235.00, '2024-04-06 11:54:19'),
(72, 3, 4, 2, 2098.00, '2024-04-06 11:54:19'),
(73, 3, 3, 1, 9380.00, '2024-04-06 11:54:19'),
(74, 3, 2, 1, 4205.00, '2024-04-06 11:54:19'),
(75, 3, 1, 1, 6199.00, '2024-04-06 11:54:19');

--
-- Triggers `tbl_transaction`
--
DELIMITER $$
CREATE TRIGGER `update_timestamp` BEFORE INSERT ON `tbl_transaction` FOR EACH ROW SET NEW.transaction_date = NOW()
$$
DELIMITER ;

--
-- Indexes for dumped tables
--

--
-- Indexes for table `tbl_customer`
--
ALTER TABLE `tbl_customer`
  ADD PRIMARY KEY (`Customer_ID`);

--
-- Indexes for table `tbl_product`
--
ALTER TABLE `tbl_product`
  ADD PRIMARY KEY (`Product_ID`);

--
-- Indexes for table `tbl_transaction`
--
ALTER TABLE `tbl_transaction`
  ADD PRIMARY KEY (`Transaction_ID`),
  ADD KEY `Customer_ID` (`Customer_ID`),
  ADD KEY `Product_ID` (`Product_ID`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `tbl_customer`
--
ALTER TABLE `tbl_customer`
  MODIFY `Customer_ID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=12;

--
-- AUTO_INCREMENT for table `tbl_product`
--
ALTER TABLE `tbl_product`
  MODIFY `Product_ID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=13;

--
-- AUTO_INCREMENT for table `tbl_transaction`
--
ALTER TABLE `tbl_transaction`
  MODIFY `Transaction_ID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=76;

--
-- Constraints for dumped tables
--

--
-- Constraints for table `tbl_transaction`
--
ALTER TABLE `tbl_transaction`
  ADD CONSTRAINT `tbl_transaction_ibfk_1` FOREIGN KEY (`Customer_ID`) REFERENCES `tbl_customer` (`Customer_ID`),
  ADD CONSTRAINT `tbl_transaction_ibfk_2` FOREIGN KEY (`Product_ID`) REFERENCES `tbl_product` (`Product_ID`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
