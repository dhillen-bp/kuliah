<?php
require_once "connect.php";

$query = "SELECT * FROM mahasiswa";
$hasil = mysqli_query($conn, $query);

while ($row = mysqli_fetch_array($hasil)) {
    echo $row['nama'];
    echo "<br/>";
}
