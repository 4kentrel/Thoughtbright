package com.mulla.thinkbright

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController

data class Quote(val text: String, val author: String)
val quote = listOf(
    Quote("The greatest glory in living lies not in never falling, but in rising every time we fall.", "Nelson Mandela"),
    Quote("The future belongs to those who believe in the beauty of their dreams.", "Eleanor Roosevelt"),
    Quote("Life is either a daring adventure or nothing at all.", "Helen Keller"),
    Quote("The only way to do great work is to love what you do.", "Steve Jobs"),
    Quote("In the end, it's not the years in your life that count. It's the life in your years.", "Albert Einstein"),
    Quote("Success is not final; failure is not fatal: It is the courage to continue that counts.", "Steve Jobs"),
    Quote("You are never too old to set another goal or to dream a new dream.", "Albert Einstein"),
    Quote("The only limit to our realization of tomorrow will be our doubts of today.", "John D. Rockefeller"),
    Quote("Life is what happens when you're busy making other plans.", "John Lennon"),
    Quote("Strive not to be a success, but rather to be of value.", "Steve Jobs"),
    Quote("The best way to predict the future is to create it.", "Albert Einstein"),
    Quote("Be the change that you wish to see in the world.", "Steve Jobs"),
    Quote("The only true wisdom is in knowing you know nothing.", "Albert Einstein"),
    Quote("To be yourself in a world that is constantly trying to make you something else is the greatest accomplishment.", "Albert Einstein"),
    Quote("Life is either a daring adventure or nothing at all.", "John Lennon"),
    Quote("It does not matter how slowly you go as long as you do not stop.", "Confucius"),
    Quote("The future belongs to those who believe in the beauty of their dreams.", "William Shakespeare"),
    Quote("Success is not final; failure is not fatal: It is the courage to continue that counts.", "Steve Jobs"),
    Quote("In the end, it's not the years in your life that count. It's the life in your years.", "Albert Einstein"),
    Quote("Darkness is the path to enlightenment.", "Confucius"),
    Quote("All that we see or seem is but a dream within a dream.", "Confucius"),
    Quote("All the world's a stage, and all the men and women merely players.", "William Shakespeare"),
    Quote("For those to whom much is given much is required.", "Confucius"),
    Quote("Genius is one percent inspiration and ninety-nine percent perspiration.", "Thomas Edison"),
    Quote("He travels the fastest and most beautiful distance.", "Rudyatiques"),
    Quote("Hell is other people's happiness.", "Confucius"),
    Quote("If at first you don't succeed, call it version 1.0.", "Confucius"),

    )
@Composable
fun Quotecard(quote: Quote) {
    Box(){

    }
    Card(
        modifier = Modifier.padding(16.dp),
        shape = RoundedCornerShape(8.dp)
    ) {
        Column(modifier = Modifier.padding(16.dp)) {
            Text(text = quote.text, style = MaterialTheme.typography.bodyLarge)
            Text(text = quote.author, style = MaterialTheme.typography.bodySmall)
        }
    }
    @Composable
    fun Quoteslist(quotes: List<Quote>) {
       LazyColumn {
           items(quotes){
               quote -> Quotecard(quote = quote)
           }
       }


        @Composable
        fun MyApp(navController: NavController) {
            Quoteslist(quotes = quotes)
}}}