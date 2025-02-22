import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { BrowserAnimationsModule } from '@angular/platform-browser/animations'
import { FormsModule,ReactiveFormsModule } from '@angular/forms';
import { HttpClient, HttpClientModule } from '@angular/common/http';
import localeCL from '@angular/common/locales/es-CL'



import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { FooterComponent } from './footer/footer.component';
import { HeaderComponent } from './header/header.component';
import { HomeBodyComponent } from './home-body/home-body.component';
import { RouterModule, Routes } from '@angular/router';
import { CompoBodyComponent } from './compo-body/compo-body.component';
import { MissingComponent } from './missing/missing.component';
import { BzrSuggestionsComponent } from './bzr-suggestions/bzr-suggestions.component';
import { BzrDungeonsdragonsComponent } from './bzr-dungeonsdragons/bzr-dungeonsdragons.component';
import { BzrLoginComponent } from './bzr-login/bzr-login.component';
import { BzrUserComponent } from './bzr-user/bzr-user.component';

const routes: Routes = [
  { path: '', redirectTo: '', component: HomeBodyComponent, pathMatch: 'full' },
  { path: 'components', component: CompoBodyComponent },
  { path: 'suggestions', component: BzrSuggestionsComponent },
  { path: 'dnd', component: BzrDungeonsdragonsComponent }
]


@NgModule({
  declarations: [
    AppComponent,
    FooterComponent,
    HeaderComponent,
    HomeBodyComponent,
    CompoBodyComponent,
    MissingComponent,
    BzrSuggestionsComponent,
    BzrDungeonsdragonsComponent,
    BzrLoginComponent,
    BzrUserComponent
  ],
  imports: [
    BrowserModule,
    BrowserAnimationsModule,
    AppRoutingModule,
    FormsModule,
    HttpClientModule,
    ReactiveFormsModule,
    RouterModule.forRoot(routes)
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule {}
