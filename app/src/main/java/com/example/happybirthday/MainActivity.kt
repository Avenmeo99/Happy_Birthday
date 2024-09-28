package com.example.happybirthday

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.happybirthday.ui.theme.HappyBirthdayTheme

// Activity utama dari aplikasih yang akan di bangun dengan wewarisi componen activity dari jetpack
// juga menyediakan fungsi dasar activity.
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            HappyBirthdayTheme {
                // Buat wadah sufarce di jaetpack compose dengan warna latar belakang dari tema aplikasi.
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    // funsi greetingText ini untuk menampilkan teks selamat ulang tahun dari from emma, dengan jaraj tepi 8dp.
                    GreetingText(
                        message = "Happy Birthday AVEN!",
                        from = "From ARIL",
                        modifier = Modifier.padding(8.dp)
                    )
                }
            }
        }
    }
}
//dari code di bawa ini mendefenisikan fungsi composable yang bernama greetingText.
@Composable
fun GreetingText(message: String, from: String, modifier: Modifier = Modifier) {
    //dari code tersebut membuat layout vertika (colom) di di jectpack compose,
    //elemen di dalamnya akan di atur di tengah secara vertikal dan mengunakan modefier.
    Column(
        verticalArrangement = Arrangement.Center,
        modifier = modifier
    ) {
        // kode di bawa ini untuk menampilkan mesege(ucapan ulang tahun)
        // dengan ukuran, font 100sp, tinggi baris 116sp, dan teks terletak di tengah.
        Text(
            text = message,
            fontSize = 100.sp,
            lineHeight = 116.sp,
            textAlign = TextAlign.Center
        )
        // kode di bawa ini berfungsi untuk menampilkan teks from.
        // dengan ukuran, font 36sp, jarak tepi 16dp, dan posisi terletak di ujung kanan ahkir.
        Text(
            text = from,
            fontSize = 36.sp,
            modifier = Modifier
                .padding(16.dp)
                .align(alignment = Alignment.End)
        )
    }
}
// kode di bawa ini mendefenisikan sebuah pertinjuaan untuk composeble.
// greetingText dengan tema HappyBrithdayThema, menampilkan ucapan " happy brithday Aven" dari "ARIL"
// dengan latar blakang yang di tampilkan di layar  atau composable secara otomatis.
@Preview(showBackground = true)
@Composable
fun BirthdayCardPreview() {
    HappyBirthdayTheme {
        GreetingText(message = "Happy Birthday AVEN!", from = "From ARIL")
    }
}