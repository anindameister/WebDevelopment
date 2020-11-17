import { Component } from '@angular/core';

import { Component } from '@angular/core';

@Component({
  selector:'app-post-create',
  templateUrl:'./post-create.component.html'
})
export class PostCreateComponent{
//the name below is upto you, but you start with on at the begining


  newPost='SubmitButtonNotInActionAsOfYet';
  onAddPost(){
    this.newPost='The user\'s post';
    alert('PostAdded')
  }

  newPost2='ButtonNotInAction';
  onAddPost2(){
    this.newPost2='The user\'s post in the 2nd box';

  }

}
