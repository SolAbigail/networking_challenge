
import androidx.arch.core.executor.testing.InstantTaskExecutorRule;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Observer;

import com.example.android.networkconnect.data.remote.extension.Result;
import com.example.android.networkconnect.domain.NetworkingRepository;
import com.example.android.networkconnect.domain.model.CharacterModel;
import com.example.android.networkconnect.domain.usecase.GetCharactersUseCase;
import com.example.android.networkconnect.domain.usecase.GetLocationUseCase;
import com.example.android.networkconnect.presenter.viewmodel.*;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.Mockito;

import java.util.List;

public class CharacterViewModelTest {

    private CharacterViewModel characterViewModel;

    @Rule
    public InstantTaskExecutorRule instantTaskExecutorRule = new InstantTaskExecutorRule();

    @Mock
    private GetCharactersUseCase getCharactersUseCase;

    @Mock
    private Observer<Result<List<CharacterModel>>> resultObserver;

    @Before
    public void setUp() {
        characterViewModel = new CharacterViewModel(
                getCharactersUseCase
        );
        characterViewModel.resultLiveData.observeForever(resultObserver);
    }

    @Test
    public void verifyInitialDataSuccessResponse() {
        final Result<List<CharacterModel>> result = new Result<List<CharacterModel>>(Result.ResultStatus.SUCCESS)
                .success(List.of(new CharacterModel(1, "Rick Sanchez", "https://rickandmortyapi.com/api/character/avatar/1.jpeg"))
                );
        MutableLiveData<Result<List<CharacterModel>>> mockResult = new MutableLiveData<>(result);
        Mockito.when(characterViewModel.resultLiveData).thenReturn(mockResult);
        characterViewModel.getCharacters();
        Mockito.verify(resultObserver).onChanged(result);
    }

}
