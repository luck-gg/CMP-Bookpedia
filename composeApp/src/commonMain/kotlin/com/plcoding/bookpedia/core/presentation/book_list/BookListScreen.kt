package com.plcoding.bookpedia.core.presentation.book_list


import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import com.plcoding.bookpedia.core.domain.Book
import org.koin.compose.viewmodel.koinViewModel

@Composable
fun BookListScreenRoot(
    viewModel: BookListViewModel = koinViewModel(),
    onBookClick: (Book) -> Unit,
){
    val state by viewModel.state.collectAsState()
    BookListScreen(
        state = state,
        onAction = { bookListAction ->
            when(bookListAction) {
                is BookListAction.OnBookClick -> onBookClick(bookListAction.book)
                else -> Unit
            }
        }
    )
}

@Composable
fun BookListScreen(
    state: BookListState,
    onAction: (BookListAction) -> Unit,
) {

}