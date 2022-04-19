-- phpMyAdmin SQL Dump
-- version 5.1.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Apr 19, 2022 at 03:47 AM
-- Server version: 10.4.22-MariaDB
-- PHP Version: 8.0.15

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `petani`
--

-- --------------------------------------------------------

--
-- Table structure for table `kategori_179`
--

CREATE TABLE `kategori_179` (
  `kode_kategori` varchar(10) NOT NULL,
  `nama_kategori` varchar(40) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `kategori_179`
--

INSERT INTO `kategori_179` (`kode_kategori`, `nama_kategori`) VALUES
('K01', 'Sayuran'),
('K02', 'Buah-Buahan');

-- --------------------------------------------------------

--
-- Table structure for table `tabel_panen179`
--

CREATE TABLE `tabel_panen179` (
  `id` int(11) NOT NULL,
  `nama_tanaman` varchar(32) NOT NULL,
  `hasil_panen` int(11) NOT NULL,
  `lama_tanam` int(11) NOT NULL,
  `tanggal_panen` date NOT NULL,
  `kode_kategori` varchar(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `tabel_panen179`
--

INSERT INTO `tabel_panen179` (`id`, `nama_tanaman`, `hasil_panen`, `lama_tanam`, `tanggal_panen`, `kode_kategori`) VALUES
(1650292319, 'Wortel', 2, 3, '2022-03-29', 'K01'),
(1650329592, 'Tomat', 2, 1, '2022-04-05', 'K01');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `kategori_179`
--
ALTER TABLE `kategori_179`
  ADD PRIMARY KEY (`kode_kategori`);

--
-- Indexes for table `tabel_panen179`
--
ALTER TABLE `tabel_panen179`
  ADD PRIMARY KEY (`id`),
  ADD KEY `kode_kategori` (`kode_kategori`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `tabel_panen179`
--
ALTER TABLE `tabel_panen179`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=1650329593;

--
-- Constraints for dumped tables
--

--
-- Constraints for table `tabel_panen179`
--
ALTER TABLE `tabel_panen179`
  ADD CONSTRAINT `tabel_panen179_ibfk_1` FOREIGN KEY (`kode_kategori`) REFERENCES `kategori_179` (`kode_kategori`) ON DELETE CASCADE ON UPDATE CASCADE;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
