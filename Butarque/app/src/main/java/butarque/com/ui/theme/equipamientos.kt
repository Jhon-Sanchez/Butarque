package butarque.com.ui.theme.composables

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import butarque.com.R

@Preview(showBackground = true)
@Composable
fun Seccion4() {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .background(Color(0xFFE0F7FA), RoundedCornerShape(16.dp))
            .padding(16.dp)
    ) {
        // 1. Imagen de la capa
        Image(
            painter = painterResource(id = R.drawable.img_equipamientos),
            contentDescription = "Ilustración de equipamientos e infraestructuras de Butarque",
            contentScale = ContentScale.Crop,
            modifier = Modifier
                .fillMaxWidth()
                .height(120.dp)
        )

        // 2. Autoría de la imagen
        Text(
            text = "Imagen: dibujo propio",
            fontSize = 12.sp,
            color = Color.Gray,
            modifier = Modifier.padding(top = 4.dp)
        )

        // 3. Nombre corto de la capa
        Text(
            text = "Equipamientos",
            fontSize = 22.sp,
            fontWeight = FontWeight.Bold,
            modifier = Modifier.padding(top = 4.dp)
        )

        // 4. Nombre completo de la capa
        Text(
            text = "Equipamientos e infraestructuras",
            fontSize = 14.sp,
            modifier = Modifier.padding(top = 2.dp)
        )

        // 5. Frase propia
        Text(
            text = "Infraestructuras y servicios clave logrados tras históricas reivindicaciones.",
            fontSize = 14.sp,
            color = Color.DarkGray,
            modifier = Modifier.padding(top = 4.dp)
        )

        // 6. Número de puntos
        Text(
            text = "6 puntos en el mapa",
            fontSize = 14.sp,
            fontWeight = FontWeight.Medium,
            modifier = Modifier.padding(top = 4.dp, bottom = 8.dp)
        )

        // 7. Botón "Ver puntos"
        Button(onClick = { }) {
            Text(text = "Ver puntos")
        }
    }
}