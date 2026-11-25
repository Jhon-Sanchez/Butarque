package butarque.com.ui.theme.composables

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
@Composable
fun InicioScreen() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp)
            .verticalScroll(rememberScrollState())
    ) {
        Text(
            text = "Mapa vivo de Butarque",
            fontSize = 28.sp,
            fontWeight = FontWeight.Bold
        )
        Text(
            text = "Elige una capa del mapa",
            fontSize = 16.sp,
            modifier = Modifier.padding(bottom = 16.dp)
        )

        Seccion1()
        Spacer(modifier = Modifier.height(16.dp))
        Seccion2()
        Spacer(modifier = Modifier.height(16.dp))
        Seccion3()
        Spacer(modifier = Modifier.height(16.dp))
        Seccion4()
    }
}