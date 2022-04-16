package com.example.calculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import org.mariuszgromada.math.mxparser.Expression

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val texto : TextView = findViewById(R.id.resultado)
        val buttonC : Button = findViewById(R.id.buttonC)
        val buttonSigno : Button = findViewById(R.id.buttonSigno)
        val buttonPorcentaje : Button = findViewById(R.id.buttonPorcentaje)
        val buttonDivision : Button = findViewById(R.id.buttonDivision)
        val button7 : Button = findViewById(R.id.button7)
        val button8 : Button = findViewById(R.id.button8)
        val button9 : Button = findViewById(R.id.button9)
        val buttonMultiplicar : Button = findViewById(R.id.buttonMultiplicar)
        val button4 : Button = findViewById(R.id.button4)
        val button5 : Button = findViewById(R.id.button5)
        val button6 : Button = findViewById(R.id.button6)
        val buttonMenos : Button = findViewById(R.id.buttonMenos)
        val button1 : Button = findViewById(R.id.button1)
        val button2 : Button = findViewById(R.id.button2)
        val button3 : Button = findViewById(R.id.button3)
        val buttonMas : Button = findViewById(R.id.buttonMas)
        val button0 : Button = findViewById(R.id.button0)
        val buttonComa : Button = findViewById(R.id.buttonComa)
        val buttonIgual : Button = findViewById(R.id.buttonIgual)



        buttonC.setOnClickListener{ botonClear(texto) }
        buttonSigno.setOnClickListener{ botonSigno(texto) }
        buttonPorcentaje.setOnClickListener{ botonPorcentaje(texto) }
        buttonDivision.setOnClickListener{ botonDivision(texto) }

        button7.setOnClickListener{ botonSiete(texto) }
        button8.setOnClickListener{ botonOcho(texto) }
        button9.setOnClickListener{ botonNoveno(texto) }
        buttonMultiplicar.setOnClickListener{ botonMultiplicar(texto) }

        button4.setOnClickListener{ botonCuatro(texto) }
        button5.setOnClickListener{ botonCinco(texto) }
        button6.setOnClickListener{ botonSeis(texto) }
        buttonMenos.setOnClickListener{ botonMenos(texto) }

        button1.setOnClickListener{ botonUno(texto) }
        button2.setOnClickListener{ botonDos(texto) }
        button3.setOnClickListener{ botonTres(texto) }
        buttonMas.setOnClickListener{ botonMas(texto) }

        button0.setOnClickListener{ botonCero(texto) }
        buttonComa.setOnClickListener{ botonComa(texto) }
        buttonIgual.setOnClickListener{ botonIgual(texto) }


    }

    private fun unirDatos(datos : String, texto: TextView) {
        val datoAnterior : String = texto.getText().toString();

        texto.setText(String.format("%s%s",datoAnterior,datos));


    }

    private fun botonIgual(texto: TextView) {

        val datos : String = texto.getText().toString();

        val expression = Expression(datos);

        val resultado : String = expression.calculate().toString();

        texto.setText(resultado);


    }

    private fun botonComa(texto: TextView) {
        unirDatos(".",texto)
    }

    private fun botonCero(texto: TextView) {
        unirDatos("0",texto)
    }

    private fun botonMas(texto: TextView) {
        unirDatos("+",texto)
    }

    private fun botonTres(texto: TextView) {
        unirDatos("3",texto)
    }

    private fun botonDos(texto: TextView) {
        unirDatos("2",texto)
    }

    private fun botonUno(texto: TextView) {
        unirDatos("1",texto)
    }

    private fun botonMenos(texto: TextView) {
        unirDatos("-",texto)
    }

    private fun botonSeis(texto: TextView) {
        unirDatos("6",texto)
    }

    private fun botonCinco(texto: TextView) {
        unirDatos("5",texto)
    }

    private fun botonCuatro(texto: TextView) {
        unirDatos("4",texto)
    }

    private fun botonMultiplicar(texto: TextView) {
        unirDatos("*",texto)
    }

    private fun botonNoveno(texto: TextView) {
        unirDatos("9",texto)
    }

    private fun botonOcho(texto: TextView) {
        unirDatos("8",texto)
    }

    private fun botonSiete(texto: TextView) {
        unirDatos("7",texto)
    }

    private fun botonDivision(texto: TextView) {
        unirDatos("/",texto)
    }

    private fun botonPorcentaje(texto: TextView) {
        unirDatos("%",texto)
    }

    private fun botonSigno(texto: TextView) {

    }

    private fun botonClear(texto : TextView) {
        texto.text = ""
    }

}