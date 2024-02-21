package com.raazi.calculator

import android.graphics.ColorSpace.Adaptation
import androidx.compose.foundation.background
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
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonColors
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardColors
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ElevatedCard
import androidx.compose.material3.FilledTonalButton
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.IconButtonDefaults
import androidx.compose.material3.MaterialTheme
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
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import kotlin.math.round

@Composable
fun MainLayout() {
    Column(modifier = Modifier.fillMaxSize()) {
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .padding(bottom = 16.dp)
        ) {
            Card(
                modifier = Modifier
                    .fillMaxWidth()
                    .wrapContentSize(),
                colors = CardDefaults.cardColors(MaterialTheme.colorScheme.secondaryContainer),
                shape = RoundedCornerShape(bottomStartPercent = 10, bottomEndPercent = 10)
            ) {
                Column(modifier = Modifier.padding(8.dp)) {
                    Spacer(modifier = Modifier.height(30.dp))
                    Row(
                        modifier = Modifier.fillMaxWidth(),
                        horizontalArrangement = Arrangement.End
                    ) {
                        Text("Formula Bar", maxLines = 1, color = Color.White.copy(alpha = 0.6f))
                    }
                    Spacer(modifier = Modifier.height(15.dp))
                    Row(
                        modifier = Modifier.fillMaxWidth(),
                        horizontalArrangement = Arrangement.End
                    ) {
                        Text(
                            text = "Result",
                            modifier = Modifier.wrapContentHeight(),
                            fontWeight = FontWeight.Bold,
                            fontSize = 60.sp
                        )
                    }
                }
                Spacer(modifier = Modifier.height(20.dp))

            }

        }

        Box(
            modifier = Modifier
                .padding(top = 30.dp)
        ) {
            Column(
                modifier = Modifier.fillMaxSize(),
                verticalArrangement = Arrangement.SpaceEvenly
            ) {
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.SpaceEvenly
                ) {

                    IconButton(
                        onClick = { /*TODO*/ },
                        colors = IconButtonDefaults.iconButtonColors(MaterialTheme.colorScheme.error),
                        modifier = Modifier.size(70.dp)
                    ) {


                        Text("C", fontSize = 30.sp, color = MaterialTheme.colorScheme.onError, textAlign = TextAlign.Center)

                    }

                    IconButton(onClick = { /*TODO*/ },
                        colors=IconButtonDefaults.iconButtonColors(
                        Color.Transparent),
                        modifier= Modifier.size(70.dp)) {

                    }
                    IconButton(onClick = { /*TODO*/ },
                        colors=IconButtonDefaults.iconButtonColors(
                            Color.Transparent),
                        modifier= Modifier.size(70.dp)) {

                    }
                    IconButton(
                        onClick = { /*TODO*/ },
                        colors = IconButtonDefaults.iconButtonColors(MaterialTheme.colorScheme.primaryContainer),
                        modifier = Modifier.size(70.dp)
                    ) {
                        Text(
                            "÷",
                            fontSize = 30.sp,
                            color = MaterialTheme.colorScheme.onPrimaryContainer,
                            textAlign = TextAlign.Center
                        )
                    }


                }
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.SpaceEvenly
                ) {
                    IconButton(
                        onClick = { /*TODO*/ },
                        colors = IconButtonDefaults.iconButtonColors(MaterialTheme.colorScheme.secondaryContainer),
                        modifier = Modifier.size(70.dp)
                    ) {
                        Text(
                            "1",
                            fontSize = 30.sp,
                            color = MaterialTheme.colorScheme.onSecondaryContainer,
                            textAlign = TextAlign.Center
                        )
                    }
                    IconButton(
                        onClick = { /*TODO*/ },
                        colors = IconButtonDefaults.iconButtonColors(MaterialTheme.colorScheme.secondaryContainer),
                        modifier = Modifier.size(70.dp)
                    ) {
                        Text(
                            "2",
                            fontSize = 30.sp,
                            color = MaterialTheme.colorScheme.onSecondaryContainer,
                            textAlign = TextAlign.Center
                        )
                    }
                    IconButton(
                        onClick = { /*TODO*/ },
                        colors = IconButtonDefaults.iconButtonColors(MaterialTheme.colorScheme.secondaryContainer),
                        modifier = Modifier.size(70.dp)
                    ) {
                        Text(
                            "3",
                            fontSize = 30.sp,
                            color = MaterialTheme.colorScheme.onSecondaryContainer,
                            textAlign = TextAlign.Center
                        )
                    }
                    IconButton(
                        onClick = { /*TODO*/ },
                        colors = IconButtonDefaults.iconButtonColors(MaterialTheme.colorScheme.primaryContainer),
                        modifier = Modifier.size(70.dp)
                    ) {
                        Text(
                            "×",
                            fontSize = 30.sp,
                            color = MaterialTheme.colorScheme.onPrimaryContainer,
                            textAlign = TextAlign.Center
                        )
                    }


                }
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.SpaceEvenly
                ) {
                    IconButton(
                        onClick = { /*TODO*/ },
                        colors = IconButtonDefaults.iconButtonColors(MaterialTheme.colorScheme.secondaryContainer),
                        modifier = Modifier.size(70.dp)
                    ) {
                        Text(
                            "4",
                            fontSize = 30.sp,
                            color = MaterialTheme.colorScheme.onSecondaryContainer,
                            textAlign = TextAlign.Center
                        )
                    }
                    IconButton(
                        onClick = { /*TODO*/ },
                        colors = IconButtonDefaults.iconButtonColors(MaterialTheme.colorScheme.secondaryContainer),
                        modifier = Modifier.size(70.dp)
                    ) {
                        Text(
                            "5",
                            fontSize = 30.sp,
                            color = MaterialTheme.colorScheme.onSecondaryContainer,
                            textAlign = TextAlign.Center
                        )
                    }
                    IconButton(
                        onClick = { /*TODO*/ },
                        colors = IconButtonDefaults.iconButtonColors(MaterialTheme.colorScheme.secondaryContainer),
                        modifier = Modifier.size(70.dp)
                    ) {
                        Text(
                            "6",
                            fontSize = 30.sp,
                            color = MaterialTheme.colorScheme.onSecondaryContainer,
                            textAlign = TextAlign.Center
                        )
                    }
                    IconButton(
                        onClick = { /*TODO*/ },
                        colors = IconButtonDefaults.iconButtonColors(MaterialTheme.colorScheme.primaryContainer),
                        modifier = Modifier.size(70.dp)
                    ) {
                        Text(
                            "-",
                            fontSize = 30.sp,
                            color = MaterialTheme.colorScheme.onPrimaryContainer,
                            textAlign = TextAlign.Center
                        )
                    }


                }
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.SpaceEvenly
                ) {
                    IconButton(
                        onClick = { /*TODO*/ },
                        colors = IconButtonDefaults.iconButtonColors(MaterialTheme.colorScheme.secondaryContainer),
                        modifier = Modifier.size(70.dp)
                    ) {
                        Text(
                            "7",
                            fontSize = 30.sp,
                            color = MaterialTheme.colorScheme.onSecondaryContainer,
                            textAlign = TextAlign.Center

                        )
                    }
                    IconButton(
                        onClick = { /*TODO*/ },
                        colors = IconButtonDefaults.iconButtonColors(MaterialTheme.colorScheme.secondaryContainer),
                        modifier = Modifier.size(70.dp)
                    ) {
                        Text(
                            "8",
                            fontSize = 30.sp,
                            color = MaterialTheme.colorScheme.onSecondaryContainer,
                            textAlign = TextAlign.Center
                        )
                    }
                    IconButton(
                        onClick = { /*TODO*/ },
                        colors = IconButtonDefaults.iconButtonColors(MaterialTheme.colorScheme.secondaryContainer),
                        modifier = Modifier.size(70.dp)
                    ) {
                        Text(
                            "9",
                            fontSize = 30.sp,
                            color = MaterialTheme.colorScheme.onSecondaryContainer,
                            textAlign = TextAlign.Center
                        )
                    }
                    IconButton(
                        onClick = { /*TODO*/ },
                        colors = IconButtonDefaults.iconButtonColors(MaterialTheme.colorScheme.primaryContainer),
                        modifier = Modifier.size(70.dp)
                    ) {
                        Text(
                            "+",
                            fontSize = 30.sp,
                            color = MaterialTheme.colorScheme.onPrimaryContainer,
                            textAlign = TextAlign.Center
                        )
                    }

                }
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.SpaceEvenly
                ) {
                    IconButton(onClick = { /*TODO*/ }, colors = IconButtonDefaults.iconButtonColors(MaterialTheme.colorScheme.secondaryContainer), modifier= Modifier.size(70.dp)) {
                        Text("0",
                            fontSize = 30.sp,
                            color = MaterialTheme.colorScheme.onSecondaryContainer,
                            textAlign = TextAlign.Center)
                    }
                    IconButton(onClick = { /*TODO*/ }, colors = IconButtonDefaults.iconButtonColors(MaterialTheme.colorScheme.secondaryContainer), modifier= Modifier.size(70.dp)) {
                        Text(".",
                            fontSize = 30.sp,
                            color = MaterialTheme.colorScheme.onSecondaryContainer,
                            textAlign = TextAlign.Center)
                    }
                    IconButton(onClick = { /*TODO*/ },colors = IconButtonDefaults.iconButtonColors(MaterialTheme.colorScheme.secondaryContainer), modifier= Modifier.size(70.dp)) {
                        Icon(imageVector = Icons.Filled.ArrowBack,
                            contentDescription = "Delete last digit",
                            tint = MaterialTheme.colorScheme.onSecondaryContainer
                        )
                    }
                    IconButton(onClick = { /*TODO*/ }, colors = IconButtonDefaults.iconButtonColors(MaterialTheme.colorScheme.tertiaryContainer), modifier= Modifier.size(70.dp)) {
                        Text("=",
                            fontSize = 30.sp,
                            color = MaterialTheme.colorScheme.onTertiaryContainer,
                            textAlign = TextAlign.Center)
                    }



                }

            }
        }

    }
}
