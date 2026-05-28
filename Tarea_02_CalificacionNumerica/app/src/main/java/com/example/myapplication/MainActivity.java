package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.textfield.TextInputEditText;

public class MainActivity extends AppCompatActivity {

    // Declaración de vistas
    private TextInputEditText etCalificacion;
    private Button btnCalcular;
    private Button btnLimpiar;
    private CardView cardResultado;
    private TextView tvLetra;
    private TextView tvDescripcion;
    private TextView tvRango;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Enlazar vistas con sus IDs del XML
        etCalificacion = findViewById(R.id.etCalificacion);
        btnCalcular    = findViewById(R.id.btnCalcular);
        btnLimpiar     = findViewById(R.id.btnLimpiar);
        cardResultado  = findViewById(R.id.cardResultado);
        tvLetra        = findViewById(R.id.tvLetra);
        tvDescripcion  = findViewById(R.id.tvDescripcion);
        tvRango        = findViewById(R.id.tvRango);

        // Click en botón Calcular
        btnCalcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calcularCalificacion();
            }
        });

        // Click en botón Limpiar
        btnLimpiar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                limpiar();
            }
        });
    }

    /**
     * Lee la calificación ingresada, la convierte a letra y muestra el resultado.
     */
    private void calcularCalificacion() {

        String input = etCalificacion.getText().toString().trim();

        // Validar que no esté vacío
        if (input.isEmpty()) {
            Toast.makeText(this, "Por favor ingresa una calificación", Toast.LENGTH_SHORT).show();
            return;
        }

        double calificacion = Double.parseDouble(input);

        // Validar rango 0 - 100
        if (calificacion < 0 || calificacion > 100) {
            Toast.makeText(this, "La calificación debe estar entre 0 y 100", Toast.LENGTH_SHORT).show();
            return;
        }

        // Determinar letra según rango
        String letra;
        String descripcion;
        String rango;
        int color;

        if (calificacion >= 90) {
            letra       = "A";
            descripcion = "¡Excelente!";
            rango       = "Rango: 90 - 100";
            color       = Color.parseColor("#2E7D32"); // verde oscuro

        } else if (calificacion >= 80) {
            letra       = "B";
            descripcion = "Muy Bueno";
            rango       = "Rango: 80 - 89";
            color       = Color.parseColor("#1565C0"); // azul oscuro

        } else if (calificacion >= 70) {
            letra       = "C";
            descripcion = "Regular";
            rango       = "Rango: 70 - 79";
            color       = Color.parseColor("#E65100"); // naranja oscuro

        } else {
            letra       = "F";
            descripcion = "Reprobado";
            rango       = "Rango: 0 - 69";
            color       = Color.parseColor("#B71C1C"); // rojo oscuro
        }

        // Mostrar resultados en las vistas
        tvLetra.setText(letra);
        tvLetra.getBackground().setTint(color);
        tvDescripcion.setText(descripcion);
        tvDescripcion.setTextColor(color);
        tvRango.setText(rango);

        // Hacer visible la tarjeta de resultado
        cardResultado.setVisibility(View.VISIBLE);
    }

    /**
     * Limpia el campo de entrada y oculta el resultado.
     */
    private void limpiar() {
        etCalificacion.setText("");
        cardResultado.setVisibility(View.GONE);
    }
}