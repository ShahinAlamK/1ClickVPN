package com.example.a1clickvpn.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.navigationBarsPadding
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.statusBarsPadding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.ArrowBack
import androidx.compose.material.icons.outlined.Menu
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.blur
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import coil.compose.AsyncImage
import coil.size.Size
import com.example.a1clickvpn.R
import com.example.a1clickvpn.components.ServerComponent
import com.example.a1clickvpn.components.StatusComponent
import com.example.a1clickvpn.components.ThemeSwitcher
import com.example.a1clickvpn.navGraph.RouteItem

@Composable
fun HomeScreen(navHost: NavController) {
    var isActive by remember { mutableStateOf(true) }

    Box(
        modifier = Modifier.fillMaxSize()
    ) {
        Image(
            modifier = Modifier
                .fillMaxSize()
                .blur(8.dp),
            contentScale = ContentScale.Crop,
            painter = painterResource(id = R.drawable.cyber), contentDescription = ""
        )


        Column(
            modifier = Modifier
                .statusBarsPadding()
                .navigationBarsPadding()
                .fillMaxSize()
                .padding(horizontal = 15.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {

            Spacer(modifier = Modifier.size(90.dp))
            Text(text = "OneVPN", style = MaterialTheme.typography.titleLarge)

            //Connected
            Spacer(modifier = Modifier.height(10.dp))
            Text(
                text = "Not Connected",
                color = MaterialTheme.colorScheme.onSecondary,
                style = MaterialTheme.typography.bodySmall
            )

            Spacer(modifier = Modifier.height(5.dp))
            Text(text = "00:00:00", style = MaterialTheme.typography.bodySmall)

            Spacer(modifier = Modifier.size(80.dp))
            ThemeSwitcher(
                darkTheme = isActive,
                size = 70.dp,
                padding = 5.dp,
                onClick = { isActive = !isActive }
            )

            Spacer(modifier = Modifier.size(90.dp))
            StatusComponent(download = "578 kb", ping = "80 ms", upload = "355 kb")

            Spacer(modifier = Modifier.height(30.dp))
            Row(
                modifier = Modifier.fillMaxWidth()
            ) {
               ServerComponent(
                   flag = "https://cdn.britannica.com/36/4036-050-37052A78/Flag-Singapore.jpg",
                   server =  "Singapore",
                   onTap = {}
               )
                Spacer(modifier = Modifier.size(15.dp))
                ServerComponent(
                    flag = "https://upload.wikimedia.org/wikipedia/commons/thumb/d/d9/Flag_of_Canada_%28Pantone%29.svg/1200px-Flag_of_Canada_%28Pantone%29.svg.png",
                    server =  "Canada",
                    onTap = {}
                )
            }

            Spacer(modifier = Modifier.size(90.dp))

        }
    }
}