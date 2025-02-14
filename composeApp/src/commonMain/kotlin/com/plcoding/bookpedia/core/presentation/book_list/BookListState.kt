package com.plcoding.bookpedia.core.presentation.book_list

import com.plcoding.bookpedia.core.domain.Book

data class BookListState(
    val searchQuery: String = "Kotlin",
    val searchResults: List<Book> = emptyList(),
    val favorites: List<Book> = emptyList(),
    val isLoading: Boolean = false,
    val selectedTabIndex: Int = 0,
    )
