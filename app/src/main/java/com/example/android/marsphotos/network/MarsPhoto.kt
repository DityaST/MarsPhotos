
package com.example.android.marsphotos.network

import com.squareup.moshi.Json

/**
 * Kelas data ini mendefinisikan foto Mars yang menyertakan ID, dan URL gambar. kemudian
 * Nama properti dari kelas data ini digunakan oleh Moshi untuk mencocokkan nama nilai pada JSON
 */
data class MarsPhoto(
        val id: String,

        // dalam class ini menggunakan objek JSON untuk menjalankan variabel dibawah
        @Json(name = "img_src") val imgSrcUrl: String
)