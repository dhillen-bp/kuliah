<?php
require_once "connect.php";
$query = "SELECT * FROM mahasiswa";
$result = mysqli_query($conn, $query);
?>

<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="css/style.css">
    <title>Daftar Mahasiswa</title>
</head>

<body>
    <div class="container">

        <h1>Daftar Mahasiswa</h1>
        <h2><a href="dorong.php">Tambah Data</a></h2>

        <table border="1" cellpadding="10" cellspacing="0">
            <thead>
                <tr>
                    <th>ID</th>
                    <th>Nama</th>
                    <th>Edit</th>
            </thead>
            <tbody>
                <?php while ($data = mysqli_fetch_assoc($result)) : ?>
                    <tr>
                        <td><?= $data['id']; ?></td>
                        <td><?= $data['nama']; ?></td>
                        <td> <a href="form.php?id=<?= $data['id']; ?>"> <button class="tombol-update"> Update </button> </a>
                            <a href="delete.php?id=<?= $data['id']; ?>"> <button class="tombol-delete"> Delete </button> </a>


                        </td>
                    </tr>
                <?php endwhile; ?>
            </tbody>
        </table>
    </div>

</body>

</html>