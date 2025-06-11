import tkinter as tk

# Testing the packaging process using python tkinter
def add_task():
    task = entry.get()
    if task:
        listbox.insert(tk.END, task)
        entry.delete(0, tk.END)

def delete_task():
    selected = listbox.curselection()
    for index in selected[::-1]:
        listbox.delete(index)

root = tk.Tk()
root.title("To-Do List")

entry = tk.Entry(root, width=40)
entry.pack(pady=10)

add_btn = tk.Button(root, text="Add Task", command=add_task)
add_btn.pack()

delete_btn = tk.Button(root, text="Delete Selected", command=delete_task)
delete_btn.pack()

listbox = tk.Listbox(root, width=50)
listbox.pack(pady=10)

root.mainloop()
