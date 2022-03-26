<?php
require_once "connect.php";

$id = $_POST['id'];
$nama = $_POST['nama'];

$query = "UPDATE mahasiswa SET nama = '$nama' WHERE id = '$id'";
$hasil = mysqli_query($conn, $query);

if ($hasil) {
    require_once "data.php";
    echo "<h4 style='color:#137df7; margin-left :50px;' 
    font-weight:bold;> update data success </h4>";
}
