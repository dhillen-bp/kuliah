<?php
require_once "connect.php";

$id = $_GET['id'];
$query = "DELETE FROM mahasiswa WHERE id = '$id'";
$hasil = mysqli_query($conn, $query);

if ($hasil) {
    include "index.php";
    echo "<h4 style='color:#fd1010; margin-left :50px;' 
    font-weight:bold;> delete data success </h4>";
}
