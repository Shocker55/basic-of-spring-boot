package basicofspringboot

import org.springframework.stereotype.Service

interface SampleService {
    fun execute(): ServiceDto
}

// @Service アノテーションを記述すると DI に使われる
@Service
class SampleServiceImpl : SampleService {
    override fun execute(): ServiceDto {
        return ServiceDto(ServicePerson("Alice", 23))
    }
}

// Controller に渡すためだけのデータクラス
data class ServiceDto(
    val person: ServicePerson,
)

data class ServicePerson(
    val name: String,
    val age: Int,
)
