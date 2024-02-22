package com.raazi.calculator

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.IconButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun MainLayout(viewModel: CalcViewModel) {
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
                colors = CardDefaults.cardColors(MaterialTheme.colorScheme.secondary),
                shape = RoundedCornerShape(bottomStartPercent = 13, bottomEndPercent = 13)
            ) {
                Column(modifier = Modifier.padding(8.dp)) {
                    Spacer(modifier = Modifier.height(50.dp))
                    Row(
                        modifier = Modifier.fillMaxWidth(),
                        horizontalArrangement = Arrangement.End
                    ) {
                        Text(viewModel.formulaString.value, maxLines = 1, color = MaterialTheme.colorScheme.onSecondary.copy(alpha = 0.6f), fontWeight = FontWeight.SemiBold)
                    }
                    Spacer(modifier = Modifier.height(15.dp))
                    Row(
                        modifier = Modifier.fillMaxWidth(),
                        horizontalArrangement = Arrangement.End
                    ) {
                        Text(
                            text = viewModel.inputString.value,
                            modifier = Modifier.wrapContentHeight(),
                            fontWeight = FontWeight.Bold,
                            fontSize = 60.sp,
                            color = MaterialTheme.colorScheme.onSecondary
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
                        onClick = { viewModel.clearAll() },
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
                        onClick = { viewModel.appendInput("/") },
                        colors = IconButtonDefaults.iconButtonColors(MaterialTheme.colorScheme.secondaryContainer),
                        modifier = Modifier.size(70.dp)
                    ) {
                        Text(
                            "÷",
                            fontSize = 30.sp,
                            color = MaterialTheme.colorScheme.onSecondaryContainer,
                            textAlign = TextAlign.Center
                        )
                    }


                }
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.SpaceEvenly
                ) {
                    IconButton(
                        onClick = { viewModel.appendInput("1") },
                        colors = IconButtonDefaults.iconButtonColors(MaterialTheme.colorScheme.surfaceVariant),
                        modifier = Modifier.size(70.dp)
                    ) {
                        Text(
                            "1",
                            fontSize = 30.sp,
                            color = MaterialTheme.colorScheme.onSurfaceVariant,
                            textAlign = TextAlign.Center
                        )
                    }
                    IconButton(
                        onClick = { viewModel.appendInput("2") },
                        colors = IconButtonDefaults.iconButtonColors(MaterialTheme.colorScheme.surfaceVariant),
                        modifier = Modifier.size(70.dp)
                    ) {
                        Text(
                            "2",
                            fontSize = 30.sp,
                            color = MaterialTheme.colorScheme.onSurfaceVariant,
                            textAlign = TextAlign.Center
                        )
                    }
                    IconButton(
                        onClick = { viewModel.appendInput("3") },
                        colors = IconButtonDefaults.iconButtonColors(MaterialTheme.colorScheme.surfaceVariant),
                        modifier = Modifier.size(70.dp)
                    ) {
                        Text(
                            "3",
                            fontSize = 30.sp,
                            color = MaterialTheme.colorScheme.onSurfaceVariant,
                            textAlign = TextAlign.Center
                        )
                    }
                    IconButton(
                        onClick = { viewModel.appendInput("*") },
                        colors = IconButtonDefaults.iconButtonColors(MaterialTheme.colorScheme.secondaryContainer),
                        modifier = Modifier.size(70.dp)
                    ) {
                        Text(
                            "×",
                            fontSize = 30.sp,
                            color = MaterialTheme.colorScheme.onSecondaryContainer,
                            textAlign = TextAlign.Center
                        )
                    }


                }
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.SpaceEvenly
                ) {
                    IconButton(
                        onClick = { viewModel.appendInput("4")},
                        colors = IconButtonDefaults.iconButtonColors(MaterialTheme.colorScheme.surfaceVariant),
                        modifier = Modifier.size(70.dp)
                    ) {
                        Text(
                            "4",
                            fontSize = 30.sp,
                            color = MaterialTheme.colorScheme.onSurfaceVariant,
                            textAlign = TextAlign.Center
                        )
                    }
                    IconButton(
                        onClick = { viewModel.appendInput("5") },
                        colors = IconButtonDefaults.iconButtonColors(MaterialTheme.colorScheme.surfaceVariant),
                        modifier = Modifier.size(70.dp)
                    ) {
                        Text(
                            "5",
                            fontSize = 30.sp,
                            color = MaterialTheme.colorScheme.onSurfaceVariant,
                            textAlign = TextAlign.Center
                        )
                    }
                    IconButton(
                        onClick = { viewModel.appendInput("6") },
                        colors = IconButtonDefaults.iconButtonColors(MaterialTheme.colorScheme.surfaceVariant),
                        modifier = Modifier.size(70.dp)
                    ) {
                        Text(
                            "6",
                            fontSize = 30.sp,
                            color = MaterialTheme.colorScheme.onSurfaceVariant,
                            textAlign = TextAlign.Center
                        )
                    }
                    IconButton(
                        onClick = { viewModel.appendInput("-") },
                        colors = IconButtonDefaults.iconButtonColors(MaterialTheme.colorScheme.secondaryContainer),
                        modifier = Modifier.size(70.dp)
                    ) {
                        Text(
                            "-",
                            fontSize = 30.sp,
                            color = MaterialTheme.colorScheme.onSecondaryContainer,
                            textAlign = TextAlign.Center
                        )
                    }


                }
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.SpaceEvenly
                ) {
                    IconButton(
                        onClick = { viewModel.appendInput("7") },
                        colors = IconButtonDefaults.iconButtonColors(MaterialTheme.colorScheme.surfaceVariant),
                        modifier = Modifier.size(70.dp)
                    ) {
                        Text(
                            "7",
                            fontSize = 30.sp,
                            color = MaterialTheme.colorScheme.onSurfaceVariant,
                            textAlign = TextAlign.Center

                        )
                    }
                    IconButton(
                        onClick = { viewModel.appendInput("8") },
                        colors = IconButtonDefaults.iconButtonColors(MaterialTheme.colorScheme.surfaceVariant),
                        modifier = Modifier.size(70.dp)
                    ) {
                        Text(
                            "8",
                            fontSize = 30.sp,
                            color = MaterialTheme.colorScheme.onSurfaceVariant,
                            textAlign = TextAlign.Center
                        )
                    }
                    IconButton(
                        onClick = { viewModel.appendInput("9") },
                        colors = IconButtonDefaults.iconButtonColors(MaterialTheme.colorScheme.surfaceVariant),
                        modifier = Modifier.size(70.dp)
                    ) {
                        Text(
                            "9",
                            fontSize = 30.sp,
                            color = MaterialTheme.colorScheme.onSurfaceVariant,
                            textAlign = TextAlign.Center
                        )
                    }
                    IconButton(
                        onClick = { viewModel.appendInput("+") },
                        colors = IconButtonDefaults.iconButtonColors(MaterialTheme.colorScheme.secondaryContainer),
                        modifier = Modifier.size(70.dp)
                    ) {
                        Text(
                            "+",
                            fontSize = 30.sp,
                            color = MaterialTheme.colorScheme.onSecondaryContainer,
                            textAlign = TextAlign.Center
                        )
                    }

                }
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.SpaceEvenly
                ) {
                    IconButton(onClick = { viewModel.appendInput("0") }, colors = IconButtonDefaults.iconButtonColors(MaterialTheme.colorScheme.surfaceVariant), modifier= Modifier.size(70.dp)) {
                        Text("0",
                            fontSize = 30.sp,
                            color = MaterialTheme.colorScheme.onSurfaceVariant,
                            textAlign = TextAlign.Center)
                    }
                    IconButton(onClick = { viewModel.appendInput(".") }, colors = IconButtonDefaults.iconButtonColors(MaterialTheme.colorScheme.surfaceVariant), modifier= Modifier.size(70.dp)) {
                        Text("•",
                            fontSize = 40.sp,
                            color = MaterialTheme.colorScheme.onSurfaceVariant,
                            textAlign = TextAlign.Center)
                    }
                    IconButton(onClick = { viewModel.backspace() },colors = IconButtonDefaults.iconButtonColors(MaterialTheme.colorScheme.secondaryContainer), modifier= Modifier.size(70.dp)) {
                        Icon(imageVector = Icons.Filled.ArrowBack,
                            contentDescription = "Delete last digit",
                            tint = MaterialTheme.colorScheme.onSecondaryContainer
                        )
                    }
                    IconButton(onClick = { viewModel.evaluateInput() }, colors = IconButtonDefaults.iconButtonColors(MaterialTheme.colorScheme.tertiaryContainer), modifier= Modifier.size(70.dp)) {
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
