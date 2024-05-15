package com.example.wazitoecommerce.ui.theme.screens.vaccinationrecords


import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.paint
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.wazitoecommerce.R
import com.example.wazitoecommerce.ui.theme.DarkGreen

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun AddVaccinationrecordsScreen(navController: NavController) {
    var vaccineName by remember { mutableStateOf(TextFieldValue()) }
    var vaccinationDate by remember { mutableStateOf(TextFieldValue()) }


    Column(
        modifier = Modifier
            .paint(painterResource(id = R.drawable.img), contentScale = ContentScale.FillBounds)

            .fillMaxSize()
            .padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    )

    {



        OutlinedTextField(
            value = vaccineName,
            onValueChange = { vaccineName = it },
            label = { Text("Vaccine Name") },
            modifier = Modifier.fillMaxWidth()
        )

        Spacer(modifier = Modifier.height(16.dp))

        OutlinedTextField(
            value = vaccinationDate,
            onValueChange = { vaccinationDate = it },
            label = { Text("Vaccination Date") },
            modifier = Modifier.fillMaxWidth()
        )

        Spacer(modifier = Modifier.height(16.dp))

        Button(
            onClick = {
                // Navigate to the previous screen when Save button is clicked
                navController.popBackStack()
            },
            modifier = Modifier.align(Alignment.End),
            colors = ButtonDefaults.buttonColors(DarkGreen)
        ) {
            Text("Save")
        }
    }


}



@Preview(showBackground = true)
@Composable
fun PreviewAddVaccinationrecordsScreen() {
    AddVaccinationrecordsScreen(navController = rememberNavController())
}
