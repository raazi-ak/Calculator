package com.raazi.calculator

import android.graphics.ColorSpace.Adaptation
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.FilledTonalButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.input.pointer.PointerIcon.Companion.Text
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun MainLayout(){
    Column {
        Box(modifier = Modifier.padding(16.dp)) {
            Column {
                Spacer(modifier = Modifier.height(30.dp))
                Row(modifier = Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.End) {
                    Text("Formula Bar", maxLines = 1, color = Color.White.copy(alpha = 0.6f))
                }
                Spacer(modifier = Modifier.height(15.dp))
                Row(modifier = Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.End) {
                    Text(
                        text = "Result",
                        modifier = Modifier.wrapContentHeight(),
                        fontWeight = FontWeight.Bold,
                        fontSize = 30.sp
                    )
                }
            }

        }

        Box(
            modifier = Modifier
                .padding(top= 30.dp)
        ) {
            Column {
                LazyVerticalGrid(
                    columns = GridCells.Adaptive(50.dp),
                    contentPadding = PaddingValues(all=60.dp)
                ) {

                    items(9) { index ->

                       FilledTonalButton(modifier=Modifier.wrapContentSize(),onClick = { /*TODO*/ }, shape = RoundedCornerShape(100)) {
                          Spacer(modifier = Modifier.height(45.dp))
                           Text("${index +1}", fontWeight = FontWeight.SemiBold, fontSize = 40.sp)
                           Spacer(modifier = Modifier.height(45.dp))
                       }
                    }
                }
            }
            Column {

            }
        }
    }
}