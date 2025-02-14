package com.plcoding.bookpedia.core.presentation.book_list

import com.plcoding.bookpedia.core.domain.Book

sealed interface BookListAction {
    data class OnSearchQueryChange(val query: String) : BookListAction
    data class OnBookClick(val book: Book) : BookListAction
    data class OnTabSelected(val index: Int) : BookListAction
}