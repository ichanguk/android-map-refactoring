package campus.tech.kakao.map.di

import campus.tech.kakao.map.data.network.KaKaoLocalApiClient
import campus.tech.kakao.map.data.network.service.KakaoLocalService
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ViewModelComponent
import dagger.hilt.android.scopes.ViewModelScoped

@Module
@InstallIn(ViewModelComponent::class)
object NetworkModule {
    @Provides
    @ViewModelScoped
    fun provideKakaoLocalService(): KakaoLocalService {
        return KaKaoLocalApiClient.retrofit.create(KakaoLocalService::class.java)
    }
}
