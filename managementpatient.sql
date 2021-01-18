-- phpMyAdmin SQL Dump
-- version 5.0.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Jan 11, 2021 at 04:44 PM
-- Server version: 10.4.11-MariaDB
-- PHP Version: 7.2.27

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `managementpatient`
--

-- --------------------------------------------------------

--
-- Table structure for table `doctor`
--

CREATE TABLE `doctor` (
  `id` int(11) NOT NULL,
  `name` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `doctor`
--

INSERT INTO `doctor` (`id`, `name`) VALUES
(1, 'dr.yayan'),
(2, 'dr.rudi');

-- --------------------------------------------------------

--
-- Table structure for table `patient`
--

CREATE TABLE `patient` (
  `id` int(11) NOT NULL,
  `name` varchar(255) DEFAULT NULL,
  `status` tinyint(1) DEFAULT 0,
  `treatment` varchar(255) DEFAULT NULL,
  `id_doctor` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `patient`
--

INSERT INTO `patient` (`id`, `name`, `status`, `treatment`, `id_doctor`) VALUES
(2, 'dadang gorbacep', 1, 'demam', 1),
(4, 'cecep gorbacep', 1, 'darah rendah', 2),
(6, 'test', 1, 'demam', 1),
(7, 'test', 1, 'demam', 2),
(8, 'Agung', 0, 'demam', 1),
(9, 'test', 0, 'demam', 1),
(10, 'test', 0, 'demam', 1),
(11, 'test', 0, 'demam', 1),
(12, 'test', 0, 'demam', 1),
(13, 'test', 0, 'demam', 2),
(14, 'test', 0, 'demam', 1),
(15, 'test', 0, 'demam', 1),
(16, 'test', 0, 'demam', 1),
(17, 'test', 0, 'demam', 1),
(18, 'test', 0, 'demam', 1),
(19, 'test', 0, 'demam', 1),
(20, 'test', 0, 'demam', 1),
(21, 'dadang gorbacep', 0, 'demam', 1),
(22, 'test', 0, 'demam', 2),
(23, 'test', 0, 'demam', 1),
(24, 'test', 0, 'demam', 2),
(25, 'test', 0, 'demam', 1);

-- --------------------------------------------------------

--
-- Table structure for table `pharmacist`
--

CREATE TABLE `pharmacist` (
  `id` int(11) NOT NULL,
  `medicine` varchar(255) DEFAULT NULL,
  `status` tinyint(1) DEFAULT 0,
  `total_medicine` int(11) DEFAULT NULL,
  `id_treatment` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `pharmacist`
--

INSERT INTO `pharmacist` (`id`, `medicine`, `status`, `total_medicine`, `id_treatment`) VALUES
(1, 'panadol 5mg 1x1', 1, 20, 1),
(2, 'panadol 1x1', 1, 10, 2),
(3, 'panadol 1x1', 1, 12, 3);

-- --------------------------------------------------------

--
-- Table structure for table `treatments`
--

CREATE TABLE `treatments` (
  `id` int(11) NOT NULL,
  `receipt` varchar(255) DEFAULT NULL,
  `status` tinyint(1) DEFAULT 0,
  `id_doctor` int(11) DEFAULT NULL,
  `id_patient` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `treatments`
--

INSERT INTO `treatments` (`id`, `receipt`, `status`, `id_doctor`, `id_patient`) VALUES
(1, 'panadol 5mg', 1, 1, 2),
(2, 'panadol', 1, 2, 4),
(3, 'panadol 5mg', 1, 1, 6),
(4, NULL, 0, 2, 7),
(5, NULL, 0, 1, 8),
(6, NULL, 0, 1, 9),
(7, NULL, 0, 1, 10),
(8, NULL, 0, 1, 11),
(9, NULL, 0, 1, 12),
(10, NULL, 0, 2, 13),
(11, NULL, 0, 1, 14),
(12, NULL, 0, 1, 15),
(13, NULL, 0, 1, 16),
(14, NULL, 0, 1, 17),
(15, NULL, 0, 1, 18),
(16, NULL, 0, 1, 19),
(17, NULL, 0, 1, 20),
(18, NULL, 0, 1, 21),
(19, NULL, 0, 2, 22),
(20, NULL, 0, 1, 23),
(21, NULL, 0, 2, 24),
(22, NULL, 0, 1, 25);

-- --------------------------------------------------------

--
-- Table structure for table `users`
--

CREATE TABLE `users` (
  `id` int(11) NOT NULL,
  `id_role` int(11) DEFAULT NULL,
  `password` varchar(255) DEFAULT NULL,
  `username` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `users`
--

INSERT INTO `users` (`id`, `id_role`, `password`, `username`) VALUES
(1, 1, 'admin', 'admin'),
(2, 2, 'nurse', 'nurse'),
(3, 3, 'doctor', 'doctor'),
(4, 4, 'pharmacist', 'pharmacist');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `doctor`
--
ALTER TABLE `doctor`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `patient`
--
ALTER TABLE `patient`
  ADD PRIMARY KEY (`id`),
  ADD KEY `FK18ugpekmmqghsfxi66d78guoc` (`id_doctor`);

--
-- Indexes for table `pharmacist`
--
ALTER TABLE `pharmacist`
  ADD PRIMARY KEY (`id`),
  ADD KEY `FKqacg0atol4pfvko10sbimvoib` (`id_treatment`);

--
-- Indexes for table `treatments`
--
ALTER TABLE `treatments`
  ADD PRIMARY KEY (`id`),
  ADD KEY `FK4atgx1isqma1nf9wu0ot9jso9` (`id_doctor`),
  ADD KEY `FKci1dmk99rpxkm0b2hgnmemroj` (`id_patient`);

--
-- Indexes for table `users`
--
ALTER TABLE `users`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `doctor`
--
ALTER TABLE `doctor`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- AUTO_INCREMENT for table `patient`
--
ALTER TABLE `patient`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=26;

--
-- AUTO_INCREMENT for table `pharmacist`
--
ALTER TABLE `pharmacist`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;

--
-- AUTO_INCREMENT for table `treatments`
--
ALTER TABLE `treatments`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=23;

--
-- AUTO_INCREMENT for table `users`
--
ALTER TABLE `users`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;

--
-- Constraints for dumped tables
--

--
-- Constraints for table `patient`
--
ALTER TABLE `patient`
  ADD CONSTRAINT `FK18ugpekmmqghsfxi66d78guoc` FOREIGN KEY (`id_doctor`) REFERENCES `doctor` (`id`);

--
-- Constraints for table `pharmacist`
--
ALTER TABLE `pharmacist`
  ADD CONSTRAINT `FKqacg0atol4pfvko10sbimvoib` FOREIGN KEY (`id_treatment`) REFERENCES `treatments` (`id`);

--
-- Constraints for table `treatments`
--
ALTER TABLE `treatments`
  ADD CONSTRAINT `FK4atgx1isqma1nf9wu0ot9jso9` FOREIGN KEY (`id_doctor`) REFERENCES `doctor` (`id`),
  ADD CONSTRAINT `FKci1dmk99rpxkm0b2hgnmemroj` FOREIGN KEY (`id_patient`) REFERENCES `patient` (`id`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
