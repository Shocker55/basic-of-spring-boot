package basicofspringboot

import org.springframework.stereotype.Service

interface SampleService {
    fun execute(): ServiceDto
}

// @Service アノテーションを記述すると DI に使われる
@Service
class SampleServiceImpl(val sampleRepository: SampleRepository) : SampleService {
    val samplePersonFromDb = sampleRepository.getPersonFromDb()
    override fun execute(): ServiceDto {
        return ServiceDto(ServicePerson(samplePersonFromDb.name, samplePersonFromDb.age))
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
