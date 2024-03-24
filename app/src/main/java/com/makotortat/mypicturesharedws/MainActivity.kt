package com.makotortat.mypicturesharedws

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.makotortat.mypicturesharedws.ui.theme.MyPictureSharedWSTheme

import androidx.compose.foundation.Image
import androidx.compose.ui.res.painterResource
import androidx.compose.foundation.layout.fillMaxWidth
import android.view.WindowManager



class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // スクリーンショットと画面録画を禁止する
        window.setFlags(
            WindowManager.LayoutParams.FLAG_SECURE,
            WindowManager.LayoutParams.FLAG_SECURE
        )

        setContent {
            MyPictureSharedWSTheme {
                // A surface container using the 'background' color from the theme
                Surface(modifier = Modifier.fillMaxSize(), color = MaterialTheme.colorScheme.background) {
                    Greeting("Android")
                }
            }
            ShowImage()
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
            text = "Hello $name!",
            modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    MyPictureSharedWSTheme {
        Greeting("Android")
    }
}
@Composable
fun ShowImage() {
    Image(
        painter = painterResource(R.drawable.img_0013),
        contentDescription = "Example Image",
        modifier = Modifier.fillMaxWidth() // 画像を画面幅に合わせて拡大縮小
    )
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    ShowImage()
}