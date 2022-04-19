<!DOCTYPE html>
<html>

<head>
    <title>CRUD Kategori</title>
    <style>
        h2 {
            color: #027ced;
        }

        h3 a {
            text-decoration: none;
            color: green;
        }

        h3 a:hover {
            color: #42f584;
        }
    </style>
</head>

<body>

    <?php
    // --- koneksi ke database
    $koneksi = mysqli_connect("localhost", "root", "", "petani") or die(mysqli_error($koneksi));
    // --- Fungsi tambah data (Create)
    function tambah($koneksi)
    {

        if (isset($_POST['btn_simpan'])) {
            $kd_kategori = $_POST['kd_kategori'];
            $nm_kategori = $_POST['nm_kategori'];

            if (!empty($kd_kategori) && !empty($nm_kategori)) {
                $sql = "INSERT INTO kategori_179 (kode_kategori, nama_kategori) VALUES ('" . $kd_kategori . "','" . $nm_kategori . "')";
                $simpan = mysqli_query($koneksi, $sql);
                if ($simpan && isset($_GET['aksi'])) {
                    if ($_GET['aksi'] == 'create') {
                        header('location: kategori.php');
                    }
                }
            } else {
                $pesan = "Tidak dapat menyimpan, data belum lengkap!";
            }
        }
    ?>
        <form action="" method="POST">
            <fieldset>
                <legend>
                    <h2>Tambah Data Kategori</h2>
                </legend>
                <label>ID Kategori <input type="number" name="kode_kategori" readonly /></label> <br>
                <label>Kode Kategori <input type="text" name="kd_kategori" /></label> <br>
                <label>Nama Kategori <input type="text" name="nm_kategori" /> </label><br>
                <br>
                <label>
                    <input type="submit" name="btn_simpan" value="Simpan" />
                    <input type="reset" name="reset" value="Besihkan" />
                </label>
                <br>
                <p><?php echo isset($pesan) ? $pesan : "" ?></p>
                <h3><a href="index.php">Kembali ke Index</a></h3>
            </fieldset>
        </form>
        <?php
    }
    // --- Tutup Fungsi tambah data

    // --- Fungsi Baca Data (Read)
    function tampil_data($koneksi)
    {
        $sql = "SELECT * FROM kategori_179 ORDER BY kode_kategori ASC";
        $query = mysqli_query($koneksi, $sql);

        echo "<fieldset>";
        echo "<legend><h2>Data Kategori</h2></legend>";

        echo "<table border='1' cellpadding='10'>";
        echo "<tr>
            <th>Kode Kategori</th>
            <th>Nama Kategori</th>
            <th>Tindakan</th>
        </tr>";

        while ($data = mysqli_fetch_array($query)) {
        ?>
            <tr>
                <td><?php echo $data['kode_kategori']; ?></td>
                <td><?php echo $data['nama_kategori']; ?></td>
                <td>
                    <a href="kategori.php?aksi=update&kode=<?php echo $data['kode_kategori']; ?>&nama=<?php echo $data['nama_kategori']; ?>">Ubah</a> |
                    <a href="kategori.php?aksi=delete&kode=<?php echo $data['kode_kategori']; ?>">Hapus</a>
                </td>
            </tr>
        <?php
        }
        echo "</table>";
        echo "</fieldset>";
    }
    // --- Tutup Fungsi Baca Data (Read)

    // --- Fungsi Ubah Data (Update)
    function ubah($koneksi)
    {
        // ubah data
        if (isset($_POST['btn_ubah'])) {
            $kd_kategori = $_POST['kd_kategori'];
            $nm_kategori = $_POST['nm_kategori'];

            if (!empty($kd_kategori) && !empty($nm_kategori)) {
                $perubahan = "kode_kategori='" . $kd_kategori . "', nama_kategori ='" . $nm_kategori . "'";
                $sql_update = "UPDATE kategori_179 SET " . $perubahan . " WHERE kode_kategori = '$kd_kategori'";
                $update = mysqli_query($koneksi, $sql_update);
                if ($update && isset($_GET['aksi'])) {
                    if ($_GET['aksi'] == 'update') {
                        header('location: kategori.php');
                    }
                }
            } else {
                $pesan = "Data tidak lengkap!";
            }
        }

        // tampilkan form ubah
        if (isset($_GET['kode'])) {
        ?>
            <a href="kategori.php"> &laquo; Home</a> |
            <a href="kategori.php?aksi=create"> (+) Tambah Data Kategori</a>
            <hr>

            <form action="" method="POST">
                <fieldset>
                    <legend>
                        <h2>Ubah Data Kategori</h2>
                    </legend>
                    <label>Kode Kategori <input type="text" name="kd_kategori" value="<?php echo $_GET['kode'] ?>" /></label> <br>
                    <label>Nama Kategori <input type="text" name="nm_kategori" value="<?php echo $_GET['nama'] ?>" /></label> <br>
                    <br>
                    <label>
                        <input type="submit" name="btn_ubah" value="Simpan Perubahan" /> atau <a href="kategori.php?aksi=delete&kode=<?php echo $_GET['kode'] ?>"> (x) Hapus data ini</a>!
                    </label>
                    <br>
                    <p><?php echo isset($pesan) ? $pesan : "" ?></p>

                </fieldset>
            </form>
    <?php
        }
    }
    // --- Tutup Fungsi Update

    // --- Fungsi Delete
    function hapus($koneksi)
    {
        if (isset($_GET['kode']) && isset($_GET['aksi'])) {
            $kode = $_GET['kode'];
            $sql_hapus = "DELETE FROM kategori_179 WHERE kode_kategoris =" . "'$kode'";
            $hapus = mysqli_query($koneksi, $sql_hapus);
            if ($hapus) {
                if ($_GET['aksi'] == 'delete') {
                    header('location: kategori.php');
                }
            } else {
                echo
                "<script>
                alert('Data tidak bisa dihapus');
                window.location.href='kategori.php';
                </script>";
            }
        }
    }
    // --- Tutup Fungsi Hapus

    //================================================================
    // --- Program Utama
    if (isset($_GET['aksi'])) {
        switch ($_GET['aksi']) {
            case "create":
                echo '<a href="kategori.php"> &laquo; Kategori</a>';
                tambah($koneksi);
                break;
            case "read":
                tampil_data($koneksi);
                break;
            case "update":
                ubah($koneksi);
                tampil_data($koneksi);
                break;
            case "delete":
                hapus($koneksi);
                break;
            default:
                echo "<h3>Aksi <i>" . $_GET['aksi'] . "</i> tidak ada!</h3>";
                tambah($koneksi);
                tampil_data($koneksi);
        }
    } else {
        tambah($koneksi);
        tampil_data($koneksi);
    }
    ?>
</body>

</html>
