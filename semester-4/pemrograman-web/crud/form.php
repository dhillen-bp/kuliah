<?php
require_once 'connect.php';
$id = $_GET['id'];
$query = "SELECT * FROM mahasiswa WHERE id = $id";
$hasil = mysqli_query($conn, $query);
$data = mysqli_fetch_assoc($hasil);
?>

<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Form Edit</title>
</head>

<body>

    <form method="post" action="update.php">
        <table width="400">
            <tr bgcolor="#f5f5f5">
                <td>
                    <h1> FORM UPDATE - Ubah Nama </h1>
                </td>
            <tr>
                <td> ID </td>
                <td>:</td>
                <td> <input type="text" name="id" disabled='disable' value="<?= $data['id']; ?>"> </td>
            </tr>
            <tr>
                <td>Nama</td>
                <td>:</td>
                <td> <input type="text" name="nama" value="<?= $data['nama']; ?>"> </td>
            </tr>
            <td><input type="hidden" name="id" value="<?= $data['id']; ?>">
                <input type="submit" name="submit" value="ubah">
            </td>
            </tr>
        </table>
    </form>

</body>

</html>