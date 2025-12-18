package com.example.photogallery.data.model

data class FlickrResponse(
    val photos: PhotosResponse
)

data class PhotosResponse(
    val photo: List<PhotoDto>
)

data class PhotoDto(
    val id: String,
    val server: String,
    val secret: String,
    val title: String
) {
    fun imageUrl(): String =
        "https://live.staticflickr.com/$server/${id}_${secret}_w.jpg"
}
