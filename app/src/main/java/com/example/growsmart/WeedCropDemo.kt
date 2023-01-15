package com.example.growsmart

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity


class WeedCropDemo: AppCompatActivity(){
//    private lateinit var predictButton: Button
//    private lateinit var selectImageButton: Button
//    private lateinit var originalImageView: ImageView
//    private lateinit var predictedImageView: ImageView
//    lateinit var context: Context



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_weed_crop)

//        val model = Shit.newInstance(this)
//
//// Creates inputs for reference.
//        val inputFeature0 = TensorBuffer.createFixedSize(intArrayOf(1, 256, 256, 3), DataType.FLOAT32)
//        inputFeature0.loadBuffer(byteBuffer)
//
//// Runs model inference and gets result.
//        val outputs = model.process(inputFeature0)
//        val outputFeature0 = outputs.outputFeature0AsTensorBuffer
//
//// Releases model resources if no longer used.
//        model.close()
//
//
//
//





//        predictButton = findViewById(R.id.predictButton)
//        selectImageButton = findViewById(R.id.selectImageButton)
//        originalImageView = findViewById(R.id.originalView)
//        predictedImageView = findViewById(R.id.predictedView)

//         Initialization
//        val options = ImageSegmenter.ImageSegmenterOptions.builder()
//            .setBaseOptions(BaseOptions.builder().useGpu().build())
//            .setOutputType(OutputType.CONFIDENCE_MASK)
//            .build()
//        Log.i(TAG,"Hi")
//        val imageSegmenter = ImageSegmenter.createFromFileAndOptions(this, MODEL_SSDMODNET, options)

        //Converting string to drawable
//        val drawable: Drawable? = ResourcesCompat.getDrawable(resources, R.drawable.weed, null)

//        val drawable = resources.getDrawable(R.drawable.weed)
//        val image = drawableToBitmap(drawable)
//
//        originalImageView.setImageDrawable(drawable)
//        originalImageView.setImageBitmap(image)

//        val results: List<Segmentation> = imageSegmenter.segment(TensorImage.fromBitmap(image))

//         INSERT code to create Mask from result eg sample test code (requires dimension to create bitmap)
//        val colorLabels = results!![0].coloredLabels.mapIndexed { index, coloredLabel ->
//            OverlayView.ColorLabel(
//                index,
//                coloredLabel.getlabel(),
//                coloredLabel.argb
//            )
//        }
//
//        // Create the mask bitmap with colors and the set of detected labels.
//        val maskTensor = results[0].masks[0]
//        val maskArray = maskTensor.buffer.array()
//        val pixels = IntArray(maskArray.size)

//        for (i in maskArray.indices) {
//            // Set isExist flag to true if any pixel contains this color.
//            val colorLabel = colorLabels[maskArray[i].toInt()].apply {
//                isExist = true
//            }
//            val color = colorLabel.getColor()
//            pixels[i] = color
//        }
//
//        val maskImage = Bitmap.createBitmap(
//            pixels,
//            maskTensor.width,
//            maskTensor.height,
//            Bitmap.Config.ARGB_8888
//        )

//         Display bitmap using ImageView?
//        predictedImageView.setImageBitmap(maskImage);
    }

//    private fun drawableToBitmap(drawable: Drawable): Bitmap? {
//        var bitmap: Bitmap? = null
//        if (drawable is BitmapDrawable) {
//            val bitmapDrawable = drawable
//            if (bitmapDrawable.bitmap != null) {
//                return bitmapDrawable.bitmap
//            }
//        }
//        bitmap = if (drawable.intrinsicWidth <= 0 || drawable.intrinsicHeight <= 0) {
//            Bitmap.createBitmap(
//                1,
//                1,
//                Bitmap.Config.ARGB_8888
//            ) // Single color bitmap will be created of 1x1 pixel
//        } else {
//            Bitmap.createBitmap(
//                drawable.intrinsicWidth,
//                drawable.intrinsicHeight,
//                Bitmap.Config.ARGB_8888
//            )
//        }
//        val canvas = Canvas(bitmap)
//        drawable.setBounds(0, 0, canvas.width, canvas.height)
//        drawable.draw(canvas)
//        return bitmap
//    }
////
//    companion object {
//        const val MODEL_SEGNET = "segnet.tflite"
//        const val MODEL_UNET = "unet.tflite"
//        const val MODEL_SSDMODNET = "test.tflite"
//        private const val TAG = "WeedCropDemo"
//    }
//
}