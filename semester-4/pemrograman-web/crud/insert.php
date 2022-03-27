<?php
require_once "connect.php";

$nama = $_POST['nama'];

$mysql = "INSERT INTO mahasiswa (nama) VALUES('$nama')";
if (mysqli_query($conn, $mysql)) {
    require_once "index.php";
    echo "<h4 style='color:#07ec2d; margin-left :50px;' 
    font-weight:bold;> data berhasil ditambahkan! </h4>";
}
