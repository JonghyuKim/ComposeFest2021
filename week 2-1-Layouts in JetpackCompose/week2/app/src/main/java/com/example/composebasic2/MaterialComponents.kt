package com.example.composebasic2

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Icon
import androidx.compose.material.IconButton
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import com.example.composebasic2.ui.theme.ComposeBasic2Theme

@Composable
fun LayoutsCodelab() {
    Scaffold(
        topBar = {
            TopAppBar(
                title = {

                    Text(
                        text = "LayoutsCodelabㄴㄴ닝라ㅓ니아러ㅣ냐오리나어리ㅏ너이라ㅓ니야뢴아ㅓ린아ㅓ리ㅏㄴ",
                        maxLines = 1
                    )
                    Text(
                        text = "LayoutsCodelabㄴㄴ닝라ㅓ니아러ㅣ냐오리나어리ㅏ너이라ㅓ니야뢴아ㅓ린아ㅓ리ㅏㄴ",
                        maxLines = 1,
                        overflow = TextOverflow.Clip
                    )

                    Text(
                        text = "LayoutsCodelabㄴㄴ닝라ㅓ니아러ㅣ냐오리나어리ㅏ너이라ㅓ니야뢴아ㅓ린아ㅓ리ㅏㄴ",
                        maxLines = 1,
                        overflow = TextOverflow.Ellipsis
                    )

                    Text(
                        text = "LayoutsCodelabㄴㄴ닝라ㅓ니아러ㅣ냐오리나어리ㅏ너이라ㅓ니야뢴아ㅓ린아ㅓ리ㅏㄴ",
                        maxLines = 1,
                        overflow = TextOverflow.Visible
                    )
                },
                actions = {
                    IconButton(onClick = { /* doSomething() */ }) {
                        Icon(Icons.Filled.Favorite, contentDescription = null)
                    }
                    IconButton(onClick = { /* doSomething() */ }) {
                        Icon(Icons.Filled.Favorite, contentDescription = null)
                    }
                    IconButton(onClick = { /* doSomething() */ }) {
                        Icon(Icons.Filled.Favorite, contentDescription = null)
                    }
                }
            )
        }
    ) { innerPadding ->
        Column {
            Text(
                text = "LayoutsCodelabㄴㄴ닝라ㅓ니아러ㅣ냐오리나어리ㅏ너이라ㅓ니야뢴아ㅓ린아ㅓ리ㅏㄴ",
                maxLines = 1,
                overflow = TextOverflow.Clip
            )

            Text(
                text = "LayoutsCodelabㄴㄴ닝라ㅓ니아러ㅣ냐오리나어리ㅏ너이라ㅓ니야뢴아ㅓ린아ㅓ리ㅏㄴ",
                maxLines = 1,
                overflow = TextOverflow.Ellipsis
            )

            Text(
                text = "LayoutsCodelabㄴㄴ닝라ㅓ니아러ㅣ냐오리나어리ㅏ너이라ㅓ니야뢴아ㅓ린아ㅓ리ㅏㄴ",
                maxLines = 1,
                overflow = TextOverflow.Visible
            )
            BodyContent(Modifier.padding(innerPadding))
        }

    }
}

@Composable
fun BodyContent(modifier: Modifier = Modifier) {
    Column(modifier = modifier) {
        Text(text = "Hi there!")
        Text(text = "Thanks for going through the Layouts codelab")
    }
}

@Preview
@Composable
fun LayoutsCodelabPreview() {
    ComposeBasic2Theme {
        LayoutsCodelab()
    }
}