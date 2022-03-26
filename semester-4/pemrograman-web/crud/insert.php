<?php
require_once "connect.php";

$nama = $_POST['nama'];

$mysql = "INSERT INTO mahasiswa (nama) VALUES('$nama')";
if (mysqli_query($conn, $mysql)) {
    echo "data berhasil ditambahkan!";
}
