package compose.material.theme

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import compose.material.theme.ui.theme.Material3ComposeTheme


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Material3ComposeTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {

                    Column(
                        modifier = Modifier
                            .verticalScroll(rememberScrollState())
                            .fillMaxSize(),
                        // Gap between children = 26 dp

                        verticalArrangement = Arrangement.spacedBy(26.dp, Alignment.CenterVertically),
                        horizontalAlignment = Alignment.CenterHorizontally
                    ) {
                        Spacer(modifier = Modifier.height(20.dp))

                        Text("Display Large",
                            style = MaterialTheme.typography.displayLarge)
                        ListDividerPadding()
                        Text("Display Medium",
                            style = MaterialTheme.typography.displayMedium)
                        ListDividerPadding()
                        Text("Display Small",
                            style = MaterialTheme.typography.displaySmall)
                        ListDividerPadding()

                        Text("Headline Large",
                            style = MaterialTheme.typography.headlineLarge)
                        ListDividerPadding()
                        Text("Headline Medium",
                            style = MaterialTheme.typography.headlineMedium)
                        ListDividerPadding()
                        Text("Headline Small",
                            style = MaterialTheme.typography.headlineSmall)
                        ListDividerPadding()





                        Text("Title Large",
                            style = MaterialTheme.typography.titleLarge)
                        ListDividerPadding()
                        Text("Title Medium",
                            style = MaterialTheme.typography.titleMedium)
                        ListDividerPadding()
                        Text("Title Small",
                            style = MaterialTheme.typography.titleSmall)
                        ListDividerPadding()



                        Text("Body Large",
                            style = MaterialTheme.typography.bodyLarge)
                        ListDividerPadding()
                        Text("Body Medium",
                            style = MaterialTheme.typography.bodyMedium)
                        ListDividerPadding()
                        Text("Body Small",
                            style = MaterialTheme.typography.bodySmall)
                        ListDividerPadding()


                        Text("Label Large",
                            style = MaterialTheme.typography.labelLarge)
                        ListDividerPadding()
                        Text("Label Medium",
                            style = MaterialTheme.typography.labelMedium)
                        ListDividerPadding()
                        Text("Label Small",
                            style = MaterialTheme.typography.labelSmall)
                        ListDividerPadding()

                        Spacer(modifier = Modifier.height(20.dp))
                    }
                }
            }
        }
    }
}

