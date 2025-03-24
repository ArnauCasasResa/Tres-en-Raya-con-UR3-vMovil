package com.example.tresenrayaconur3vmovil

import android.util.Log
import java.io.IOException
import java.io.InputStream
import java.io.PrintWriter
import java.net.ServerSocket
import java.net.Socket

class ServerClass() :Thread(){
    lateinit var serverSocket:ServerSocket
    lateinit var clientSocket: Socket
    lateinit var outputStream: PrintWriter

    fun iniciar() {
        try {
            serverSocket = ServerSocket(5858)
            clientSocket = serverSocket.accept()
            outputStream = PrintWriter(clientSocket.getOutputStream(), true)
        } catch (ex: IOException) {
            ex.printStackTrace()
        }
    }

    fun write(envio: String){
        try {
            Log.i("Server write","$envio sending")
            outputStream.println(envio)
        }catch (ex:IOException){
            ex.printStackTrace()
        }
    }



}