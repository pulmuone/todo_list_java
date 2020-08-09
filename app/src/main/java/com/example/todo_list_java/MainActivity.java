package com.example.todo_list_java;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.lifecycle.ViewModelProvider;
import androidx.room.Room;

import android.os.AsyncTask;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

import com.example.todo_list_java.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

//    private EditText mTodoEditText;
//    private TextView mResultTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_main);
        ActivityMainBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        binding.setLifecycleOwner(this);

        MainViewModel viewModel = new ViewModelProvider(this, new ViewModelProvider.AndroidViewModelFactory(getApplication())).get(MainViewModel.class);

        binding.setViewModel(viewModel);

//        mTodoEditText = findViewById(R.id.todo_edit);
//        mResultTextView = findViewById(R.id.result_text);
//
//        viewModel.getAll().observe(this, todos -> {
//            binding.resultText.setText(todos.toString());
//        });
//
//        findViewById(R.id.add_button).setOnClickListener(v -> {
//            viewModel.insert(new Todo(binding.todoEdit.getText().toString()));
//        });
    }
}