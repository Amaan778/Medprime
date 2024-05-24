package com.app.medprime

import android.graphics.BitmapFactory
import android.os.Bundle
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView

class PhotoGalleryActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_photo_gallery)

//        val imageView: ImageView = findViewById(R.id.imageView)
//        val imagePath = intent.getStringExtra("imagePath")
//
//        if (imagePath != null) {
//            val bitmap = BitmapFactory.decodeFile(imagePath)
//            imageView.setImageBitmap(bitmap)
//        }

        val imageView: ImageView = findViewById(R.id.imageView)
        val imagePath = intent.getStringExtra("imagePath")

        if (imagePath != null) {
            val bitmap = BitmapFactory.decodeFile(imagePath)
            imageView.setImageBitmap(bitmap)
        }

    }
}