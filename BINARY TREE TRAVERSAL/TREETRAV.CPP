#include<iostream>
using namespace std;
#include<conio.h>

class tree
{
	public:
		int d;
		tree *left;
		tree *right;
};
tree *get_node(int str)
{
	tree *tr_item=new tree;
	if(tr_item!=NULL)
	{
		tr_item->left=NULL;
		tr_item->right=NULL;
		tr_item->d=str;
	}
	else
	{
	    cout<<"\nothing allocated"<<endl;
	}
	return(tr_item);
}
tree* create (tree *root,int num)
{
	tree *prev=NULL,*curr=root;
	if(root==NULL)
	{
		root=get_node(num);
	}
	else
	{
		while(curr!=NULL)
		{
			prev=curr;
			if(num<curr->d)
			{
				curr=curr->left;
			}
			else
			{
				curr=curr->right;
			}
		}
		      if(num<prev->d)
		      {
				prev->left=get_node(num);
			//	cout<<"\n(left):"<<root->d;
		      }
		      else
		      {
				prev->right=get_node(num);
			//	cout<<"\n(right):"<<root->d;
		      }


	}
	return(root);
}
void inorder(tree *ptr)
{
	if(ptr!=NULL)
	{
		inorder(ptr->left);
		cout<<" "<<ptr->d;
		inorder(ptr->right);

	}
}

void preorder(tree *ptr)
{
	if(ptr!=NULL)
	{
		cout<<" "<<ptr->d;
		preorder(ptr->left);
		preorder(ptr->right);

	}
}
void postorder(tree *ptr)
{
	if(ptr!=NULL)
	{
		postorder(ptr->left);
		postorder(ptr->right);
		cout<<" "<<ptr->d;
	}
}
int search(tree *ptr,int num)
{
	static int x=0;
	if(ptr!=NULL)
	{
		search(ptr->left,num);
		search(ptr->right,num);
		if(ptr->d==num)
		{
			x=ptr->d;
		}
	}
	return (int)x;
}
int main()
{
	tree *root= NULL;
	int i=1,num,p;
	int x,y;
	//clrscr();
	cout<<"enter the number of nodes"<<endl;
	cin>>p;
	if(p>0)
	{
		while(i++<=p)
		{

			cout<<"\nenter node: "<<endl;
			cin>>num;
			root=create(root,num);

		}
		cout<<"\nInorder  traversal:"<<endl;
		inorder(root);
		cout<<"\nPreorder traversal"<<endl;
		preorder(root);
		cout<<"\nPostorder Traversal"<<endl;
		postorder(root);
		cout<<"\nenter a numnber to search"<<endl;
		cin>>x;
		y=search(root,x);
		if(y==x)
		{
			cout<<"The seacrh value exist"<<endl;
		}
		else
		{
			cout<<"No such value found"<<endl;
		}
	     }
		 getch();
}

